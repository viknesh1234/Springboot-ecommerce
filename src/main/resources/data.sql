-- Insert sample admin
INSERT INTO users (username, password, role, enabled) VALUES
('admin', '{bcrypt}$2a$10$M1rF.6KUfYV3j/h/fu0LPOZSRVfwM2wz7KMpHt0K1ZmoiGL9bnWbG', 'ROLE_ADMIN', true);

-- Password is 'admin123' (bcrypt encrypted)

-- Insert sample products
INSERT INTO product (name, price, quantity, description) VALUES
('iPhone 14', 799.99, 10, 'Latest Apple iPhone'),
('Samsung TV', 1200.00, 5, '55 inch 4K Smart TV');
