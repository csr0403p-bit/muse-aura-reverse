package com.facebook.aura.skills.connect.repository;

import X.AbstractC7559F3s;
import X.C9hr;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepository$registerOAuth-yxL6bBk$$inlined$postRegister-gIAlu-s$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class CustomConnectorRegisterRepository$registerOAuthyxL6bBk$$inlined$postRegistergIAlus$1 extends AbstractC7559F3s implements Function0<C9hr<CustomConnectorOAuthRegisterRequestJson>> {
    public static final CustomConnectorRegisterRepository$registerOAuthyxL6bBk$$inlined$postRegistergIAlus$1 INSTANCE = new CustomConnectorRegisterRepository$registerOAuthyxL6bBk$$inlined$postRegistergIAlus$1();

    public CustomConnectorRegisterRepository$registerOAuthyxL6bBk$$inlined$postRegistergIAlus$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<CustomConnectorOAuthRegisterRequestJson> invoke() {
        return CustomConnectorOAuthRegisterRequestJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<CustomConnectorOAuthRegisterRequestJson> invoke() {
        return CustomConnectorOAuthRegisterRequestJson$$serializer.INSTANCE;
    }
}
