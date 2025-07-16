package com.example.simpleecommerceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.simpleecommerceapp.entity.Message;
import com.example.simpleecommerceapp.repo.ContactRepo;

@Service
public class ContactService {

    @Autowired
    private ContactRepo contactRepo;

    @Autowired
    private JavaMailSender mailSender;

    public List<Message> getAllMessage() {
        return contactRepo.findAll();
    }

    public Message getMessageById(Long id) {
        return contactRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("❌ Message with ID " + id + " not found"));
    }

    public void createMessage(Message message) {
        // ✅ Step 1: Save message to DB
        Message savedMessage = contactRepo.save(message);

        // ✅ Step 2: Send Email to Your Gmail
        try {
            SimpleMailMessage mail = new SimpleMailMessage();
            mail.setTo("vikneshr07@gmail.com"); // ✅ Replace with your receiving email
            mail.setSubject("📩 New Message from " + savedMessage.getName());
            mail.setText(
                "🧑 Name: " + savedMessage.getName() + "\n" +
                "📧 Email: " + savedMessage.getEmail() + "\n\n" +
                "📝 Message:\n" + savedMessage.getContent()
            );

            mailSender.send(mail);
            System.out.println("✅ Email sent successfully to vikneshr07@gmail.com");
        } catch (Exception e) {
            System.out.println("❌ Email sending failed: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void updateMessage(Message message) {
        contactRepo.findById(message.getId())
            .orElseThrow(() -> new RuntimeException("❌ Message with ID " + message.getId() + " not found"));
        contactRepo.save(message);
    }

    public void deleteMessage(Long id) {
        contactRepo.findById(id)
            .orElseThrow(() -> new RuntimeException("❌ Message with ID " + id + " not found"));
        contactRepo.deleteById(id);
    }
}
