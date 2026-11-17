package com.facebook.aura.skills.connect.config;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AccountIdentity {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AccountIdentity[] $VALUES;
    public static final AccountIdentity FACEBOOK;
    public static final AccountIdentity INSTAGRAM;
    public static final AccountIdentity INSTAGRAM_MESSAGES;
    public static final AccountIdentity META_BUSINESS;
    public static final AccountIdentity THREADS;
    public static final AccountIdentity THREADS_MESSAGES;
    public static final AccountIdentity WHATSAPP;
    public final String idFieldName;
    public final String profilePicFieldName;
    public final String usernameFieldName;
    public final String wireName;

    static {
        AccountIdentity accountIdentity = new AccountIdentity("WHATSAPP", 0, NativeLoginAccountResolverKt.WHATSAPP_USER_ID, "", "", "");
        WHATSAPP = accountIdentity;
        AccountIdentity accountIdentity2 = new AccountIdentity("FACEBOOK", 1, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK, "fb_user_id", "name", "profile_pic_url");
        FACEBOOK = accountIdentity2;
        AccountIdentity accountIdentity3 = new AccountIdentity("INSTAGRAM", 2, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM, "user_fbid", "username", "profile_picture_url");
        INSTAGRAM = accountIdentity3;
        AccountIdentity accountIdentity4 = new AccountIdentity("INSTAGRAM_MESSAGES", 3, "instagram_messages", "user_fbid", "username", "profile_picture_url");
        INSTAGRAM_MESSAGES = accountIdentity4;
        AccountIdentity accountIdentity5 = new AccountIdentity("THREADS", 4, MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_THREADS, "id", "username", "profile_pic_url");
        THREADS = accountIdentity5;
        AccountIdentity accountIdentity6 = new AccountIdentity("THREADS_MESSAGES", 5, "threads_messages", "id", "username", "profile_pic_url");
        THREADS_MESSAGES = accountIdentity6;
        AccountIdentity accountIdentity7 = new AccountIdentity("META_BUSINESS", 6, SkillConnectConfigKt.META_BUSINESS_SKILL_ID, "id", "label", "profile_picture_url");
        META_BUSINESS = accountIdentity7;
        AccountIdentity[] accountIdentityArr = {accountIdentity, accountIdentity2, accountIdentity3, accountIdentity4, accountIdentity5, accountIdentity6, accountIdentity7};
        $VALUES = accountIdentityArr;
        $ENTRIES = C3cG.A0w(accountIdentityArr);
    }

    public static Ey9<AccountIdentity> getEntries() {
        return $ENTRIES;
    }

    public static AccountIdentity valueOf(String str) {
        return (AccountIdentity) Enum.valueOf(AccountIdentity.class, str);
    }

    public static AccountIdentity[] values() {
        return (AccountIdentity[]) $VALUES.clone();
    }

    public final String getIdFieldName() {
        return this.idFieldName;
    }

    public final String getProfilePicFieldName() {
        return this.profilePicFieldName;
    }

    public final String getUsernameFieldName() {
        return this.usernameFieldName;
    }

    public final String getWireName() {
        return this.wireName;
    }

    public AccountIdentity(String str, int i, String str2, String str3, String str4, String str5) {
        this.wireName = str2;
        this.idFieldName = str3;
        this.usernameFieldName = str4;
        this.profilePicFieldName = str5;
    }
}
