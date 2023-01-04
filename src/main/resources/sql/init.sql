drop table if exists lite_flow_chain;
create table lite_flow_chain
(
    lite_flow_chain_id   bigint(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '流程规则id',
    application_name           varchar(64) COLLATE utf8mb4_bin NOT NULL default '' comment '应用名称',
    chain_name        varchar(64) COLLATE utf8mb4_bin default '' comment '流程名称',
    el_data           varchar(255) COLLATE utf8mb4_bin default '' comment 'el表达式',
    `creator`                   varchar(64) COLLATE utf8mb4_bin NOT NULL default '' COMMENT '创建者',
    `gmt_create`                datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modifieder`                varchar(64) COLLATE utf8mb4_bin NOT NULL default '' COMMENT '更新者',
    `gmt_modified`              datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `creator_id`                bigint(20) DEFAULT NULL COMMENT '创建用户ID',
    `modifieder_id`             bigint(20) DEFAULT NULL COMMENT '更新用户ID',
    `tenant_id`                 bigint(20) DEFAULT NULL COMMENT '租户ID',
    `company_id`                bigint(20) DEFAULT NULL COMMENT '公司ID',
    `version`                   bigint(20) unsigned NOT NULL DEFAULT '0' COMMENT '版本号',
    `del_flag`                  tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否删除：0，未删除；1，删除',
    primary key (lite_flow_chain_id) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='流程规则表';

INSERT INTO `liteflow-demo`.`lite_flow_chain` (`application_name`, `chain_name`, `el_data`) VALUES ('liteflow-demo', 'chain2', 'THEN(a, b, c);');

INSERT INTO `liteflow-demo`.`lite_flow_chain` (`application_name`, `chain_name`, `el_data`) VALUES ('liteflow-demo', 'chain3', 'SWITCH(a).to(b, c);');