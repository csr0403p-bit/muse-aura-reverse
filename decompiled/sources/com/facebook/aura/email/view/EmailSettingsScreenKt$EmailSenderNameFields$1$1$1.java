package com.facebook.aura.email.view;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.email.viewmodel.EmailViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class EmailSettingsScreenKt$EmailSenderNameFields$1$1$1 extends C7438Evz implements G0U<String, Unit> {
    public EmailSettingsScreenKt$EmailSenderNameFields$1$1$1(Object obj) {
        super(1, obj, EmailViewModel.class, "editName", "editName(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((EmailViewModel) AnonymousClass006.A0o(str, this)).editName(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
