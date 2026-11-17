package com.facebook.aura.commands.sms;

import X.AbstractC7559F3s;
import X.C2nw;
import X.C7384Etj;
import X.C7pd;
import X.C7qW;
import X.G0U;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SmsMessageHandlerSupportKt$ambiguousMatchesJson$1$1$1 extends AbstractC7559F3s implements G0U<C2nw, Unit> {
    public final /* synthetic */ AmbiguousNameMatch $match;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C2nw c2nw) {
        C7384Etj.A0Y(c2nw, 0);
        C7qW.A06("query", this.$match.query, c2nw);
        AmbiguousNameMatch ambiguousNameMatch = this.$match;
        C7pd c7pdA01 = C7pd.A01();
        Iterator<ContactCandidate> it = ambiguousNameMatch.candidates.iterator();
        while (it.hasNext()) {
            C7qW.A0B(new SmsMessageHandlerSupportKt$ambiguousMatchesJson$1$1$1$1$1$1(it.next()), c7pdA01);
        }
        c2nw.A01("candidates", C7pd.A00(c7pdA01));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsMessageHandlerSupportKt$ambiguousMatchesJson$1$1$1(AmbiguousNameMatch ambiguousNameMatch) {
        super(1);
        this.$match = ambiguousNameMatch;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2nw c2nw) {
        invoke2(c2nw);
        return Unit.INSTANCE;
    }
}
