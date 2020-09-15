package com.zff.service;

/*
账号业务层接口
 */
public interface IAccountService {
    /**
     * 模拟保存账户
     */
    void saveAccount();
    /**
     * 模拟更新账户
     */
    void updateAccount(int i);
    /**
     * 模拟删除账户
     */
    int deleteAccount();
}
