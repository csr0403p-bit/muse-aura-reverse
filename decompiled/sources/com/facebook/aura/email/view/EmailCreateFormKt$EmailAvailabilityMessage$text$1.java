package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.email.model.EmailAddressAvailability;
import com.facebook.aura.email.viewmodel.EmailHandleError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailCreateFormKt$EmailAvailabilityMessage$text$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ EmailAddressAvailability $availability;
    public final /* synthetic */ EmailHandleError $handleError;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRetry;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailCreateFormKt$EmailAvailabilityMessage$text$1(EmailAddressAvailability emailAddressAvailability, EmailHandleError emailHandleError, Function0<Unit> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$availability = emailAddressAvailability;
        this.$handleError = emailHandleError;
        this.$onRetry = function0;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailCreateFormKt.EmailAvailabilityMessage(this.$availability, this.$handleError, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
