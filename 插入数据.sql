product_info

INSERT INTO `yangkun`.`product_info`(`product_id`, `product_name`, `product_price`, `product_stock`, `product_description`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`) VALUES ('1', '苹果', 12.00, 10, NULL, NULL, 0, 1, '2020-04-05 09:08:15', '2020-04-05 09:08:15');

INSERT INTO `yangkun`.`product_info`(`product_id`, `product_name`, `product_price`, `product_stock`, `product_description`, `product_icon`, `product_status`, `category_type`, `create_time`, `update_time`) VALUES ('2', '梨子', 18.00, 20, NULL, NULL, 0, 1, '2020-04-05 09:08:15', '2020-04-05 09:08:15');

product_category

INSERT INTO `product_category`(`category_id`, `category_name`, `category_type`, `create_time`, `update_time`) VALUES (1, '一级', 1, '2020-04-06 06:31:34', '2020-04-06 06:31:34');

INSERT INTO `product_category`(`category_id`, `category_name`, `category_type`, `create_time`, `update_time`) VALUES (2, '二级', 2, '2020-04-06 06:31:34', '2020-04-06 06:31:34');


order_master

INSERT INTO `order_master`(`order_id`, `buyer_name`, `buyer_phone`, `buyer_address`, `buyer_openid`, `order_amount`, `order_status`, `pay_status`, `create_time`, `update_time`) VALUES ('1', 'yangk', '186', '186', '666', 0.00, 0, 0, '2020-04-06 06:52:18', '2020-04-06 06:52:18');
