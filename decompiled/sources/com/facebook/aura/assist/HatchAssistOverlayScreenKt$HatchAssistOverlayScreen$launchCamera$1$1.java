package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.model.HatchFileProviderUtil;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$launchCamera$1$1 extends AbstractC7559F3s implements G0U<File, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ G0U<String, Unit> $onImageAttached;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(File file) {
        C7384Etj.A0Y(file, 0);
        G0U<String, Unit> g0u = this.$onImageAttached;
        String string = HatchFileProviderUtil.INSTANCE.getUriForFile(this.$context, file).toString();
        C7384Etj.A0U(string);
        g0u.invoke(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$launchCamera$1$1(G0U<? super String, Unit> g0u, Context context) {
        super(1);
        this.$onImageAttached = g0u;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(File file) {
        invoke2(file);
        return Unit.INSTANCE;
    }
}
