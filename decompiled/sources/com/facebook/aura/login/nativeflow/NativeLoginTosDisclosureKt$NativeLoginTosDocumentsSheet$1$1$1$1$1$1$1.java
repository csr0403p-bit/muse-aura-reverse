package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchTosDocument $document;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginTosDisclosureKt$NativeLoginTosDocumentsSheet$1$1$1$1$1$1$1(HatchTosDocument hatchTosDocument, Context context) {
        super(0);
        this.$document = hatchTosDocument;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraBrowserLauncherKt.openBrowser(this.$document.url, this.$context);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
