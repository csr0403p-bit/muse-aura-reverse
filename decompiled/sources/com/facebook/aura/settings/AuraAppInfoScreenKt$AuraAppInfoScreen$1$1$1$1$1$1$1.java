package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.AnonymousClass007;
import X.C7384Etj;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraAppInfoScreenKt$AuraAppInfoScreen$1$1$1$1$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $deviceId;
    public final /* synthetic */ View $view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraAppInfoScreenKt$AuraAppInfoScreen$1$1$1$1$1$1$1(Context context, String str, View view) {
        super(0);
        this.$context = context;
        this.$deviceId = str;
        this.$view = view;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Object systemService = this.$context.getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
        C7384Etj.A0Z(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(this.$context.getString(R.string._name_removed__res_0x7f1203a5), this.$deviceId));
        AnonymousClass007.A0n(this.$view, AuraToast.Companion, this.$context.getString(R.string._name_removed__res_0x7f1203a6));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
