/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.immo.service;

import com.immo.bean.Annonceur;
import javax.ejb.Stateful;

@Stateful
public class AuthUser {

    private Annonceur curUser;

    public void signOut() {
        curUser = null;
    }

    public void signIn(Annonceur user) {
        curUser = user;
    }

    public Annonceur getCurUser() {
        return curUser;
    }

    public void setCurUser(Annonceur curUser) {
        this.curUser = curUser;
    }

}
