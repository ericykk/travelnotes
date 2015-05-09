--用户表
create table t_travel_note_user(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
openid VARCHAR(50) not null comment '登录令牌即唯一标识',
nickname VARCHAR(50) DEFAULT null comment '用户昵称',
sex CHAR(1)  DEFAULT null comment '性别',
city varchar(50)  DEFAULT null COMMENT '用户所在城市',
province varchar(50)  DEFAULT null COMMENT '用户所在省份',
country varchar(50)  DEFAULT null COMMENT '用户所在国家',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '用户关注时间',
login_time datetime not NULL COMMENT '登录时间',
login_account_type varchar(10) default null comment '登录账户类型',
PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='登录用户信息';
--游记记录表
t_travel_note_data
--游记统计表(浏览次数，评论次数，点赞次数，分享次数，收藏次数)
create table t_travel_note_statistic(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
pk_travel_note bigint(20) NOT NULL comment '游记记录主键' unique,
browse_number int(5) NOT NULL default 0 COMMENT '浏览次数',
comment_number int(5) NOT NULL default 0 COMMENT '评论次数',
praise_number int(5) NOT NULL default 0 COMMENT '获赞次数',
share_number int(5) NOT NULL default 0 COMMENT '分享次数',
collection_number int(5) NOT NULL default 0 COMMENT '收藏次数',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='游记统计表';

--游记评论记录表(游记评论回复 找驴友信息评论)
create table t_travel_note_comment(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
pk_travel_note bigint(20) NOT NULL comment '游记记录主键',
comment_content varchar(100) default NULL COMMENT '评论内容',
comment_time datetime NOT NULL  COMMENT '评论时间',
comment_status varchar(10) NOT NULL default 'Y' COMMENT '评论状态 Y有效 N 无效',
comment_user VARCHAR(50) not null comment '评论用户唯一标识',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
is_hidden varchar(10) NOT NULL default 'N' COMMENT '是否隐藏 Y隐藏  N 不隐藏',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='游记评论记录表';

--游记浏览记录表
create table t_travel_note_browse(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
pk_travel_note bigint(20) NOT NULL comment '游记记录主键',
browse_time datetime NOT NULL  COMMENT '浏览时间',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='游记浏览记录表';

--游记分享记录表
create table t_travel_note_share(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
pk_travel_note bigint(20) NOT NULL comment '游记记录主键',
share_time datetime NOT NULL  COMMENT '分享时间',
share_user varchar(50) not null COMMENT '分享人',
share_type varchar(10) not null COMMENT '分享渠道即通过什么分享 ，分享到哪里',
share_link varchar(100) not null comment '分享链接',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='游记浏览记录表';

--游记点赞记录表
create table t_travel_note_praise(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
pk_travel_note bigint(20) NOT NULL comment '游记记录主键',
praise_time datetime NOT NULL  COMMENT '点赞时间',
praise_user varchar(50) not null COMMENT '点赞人',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id),
constraint unique(pk_travel_note,praise_user)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='游记浏览记录表';

--地主信息表
create table t_travel_landlord(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
openid VARCHAR(50) not null unique comment '用户登录令牌即唯一标识',
landlord_time datetime NOT NULL  COMMENT '成为地主时间',
landlord_introduction varchar(200) default null COMMENT '地主介绍信息',
landlord_praise_number int(4) NOT NULL default 0 comment '地主获赞次数',
landlord_criticism_number int(4) NOT NULL default 0 comment '地主被批评次数',
landlord_status varchar(10) not null default 'Y' comment '地主身份当前是否有效 N无效  Y 有效',
is_active varchar(10) not null default 'N' comment '地主身份审核是否通过  Y通过  N 未通过 ',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='地主信息表';

--申请信息表(申请成为地主或者申请到地主地盘做客)
create table t_travel_landlord_apply(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
apply_openid VARCHAR(50) not null  comment '申请用户登录令牌即唯一标识',
apply_time datetime NOT NULL  COMMENT '申请时间',
apply_reason varchar(200) not null COMMENT '申请原由',
apply_status varchar(10) not null default '0' comment '申请状态  0 未审批  1 审批通过  2  审批未通过',
apply_reply  varchar(100) not null COMMENT '审批回复',
approval_time datetime default NULL  COMMENT '审批时间',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
landlord_openid VARCHAR(50) not null comment '地主用户登录令牌即唯一标识',
apply_type varchar(10) not null default '0' comment '申请类型   0  申请成为地主   1  申请到地主地盘做客',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='申请信息表';


--找驴友信息表
create table t_travel_find_travelers(
id bigint(20) NOT NULL AUTO_INCREMENT comment '主键',
apply_openid VARCHAR(50) not null  comment '申请用户登录令牌即唯一标识',
release_time datetime NOT NULL  COMMENT '发布信息时间',
apply_reason varchar(200) not null COMMENT '申请原由',
apply_status varchar(10) not null default '0' comment '申请状态  0 未审批  1 审批通过  2  审批未通过',
apply_reply  varchar(100) not null COMMENT '审批回复',
approval_time datetime default NULL  COMMENT '审批时间',
delete_flag tinyint(4) not null default '0' comment '是否删除标志',
create_time datetime not NULL COMMENT '创建时间',
landlord_openid VARCHAR(50) not null comment '地主用户登录令牌即唯一标识',
apply_type varchar(10) not null default '0' comment '申请类型   0  申请成为地主   1  申请到地主地盘做客',
update_time timestamp  NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
primary key(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT ='申请信息表';

