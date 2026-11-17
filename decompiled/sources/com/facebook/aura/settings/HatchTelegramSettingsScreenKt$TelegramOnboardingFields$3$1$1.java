package com.facebook.aura.settings;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.C1733ApU;
import X.C1OR;
import X.C7384Etj;
import X.C7Je;
import X.C7mU;
import X.G0U;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchTelegramSettingsScreenKt$TelegramOnboardingFields$3$1$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ ApQ $helperText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchTelegramSettingsScreenKt$TelegramOnboardingFields$3$1$1(ApQ apQ, Context context) {
        super(1);
        this.$helperText = apQ;
        this.$context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i) {
        C1733ApU c1733ApU = (C1733ApU) AbstractC0878AGe.A0G(this.$helperText.A04(i, i));
        if (c1733ApU != null) {
            Context context = this.$context;
            String str = ((C1OR) c1733ApU.A02).A00;
            boolean z = C7Je.A02;
            Uri uri = Uri.parse(str);
            C7384Etj.A0U(uri);
            C7mU.A00().A02().A05(context, new Intent("android.intent.action.VIEW", uri));
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
