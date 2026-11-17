package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.G0U;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderSheetKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SmsMessageHandlerSupportKt$ambiguousMatchesJson$1$1$1$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ ContactCandidate $candidate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("name", this.$candidate.name, c2nw);
        C7qW.A06(HatchLinkOrderSheetKt.PHONE, this.$candidate.phone, c2nw);
        C7qW.A06("contact_id", this.$candidate.contactId, c2nw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsMessageHandlerSupportKt$ambiguousMatchesJson$1$1$1$1$1$1(ContactCandidate contactCandidate) {
        super(1);
        this.$candidate = contactCandidate;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
