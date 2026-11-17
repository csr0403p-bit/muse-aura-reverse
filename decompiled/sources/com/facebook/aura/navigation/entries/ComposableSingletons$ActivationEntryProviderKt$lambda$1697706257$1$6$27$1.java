package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C3cF;
import X.C7384Etj;
import android.content.SharedPreferences;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$27$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ SharedPreferences $debugOverlayPrefs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$6$27$1(SharedPreferences sharedPreferences) {
        super(0);
        this.$debugOverlayPrefs = sharedPreferences;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        SharedPreferences sharedPreferences = this.$debugOverlayPrefs;
        C7384Etj.A0X(sharedPreferences);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(C3cF.A00(40), false);
        editorEdit.apply();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
