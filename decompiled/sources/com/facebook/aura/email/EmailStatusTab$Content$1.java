package com.facebook.aura.email;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.status.api.StatusTabEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailStatusTab$Content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ StatusTabEntry $entry;
    public final /* synthetic */ String $initialAction;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onInitialActionHandled;
    public final /* synthetic */ EmailStatusTab $tmp0_rcvr;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailStatusTab$Content$1(EmailStatusTab emailStatusTab, float f, float f2, BRg bRg, String str, Function0<Unit> function0, StatusTabEntry statusTabEntry, int i) {
        super(2);
        this.$tmp0_rcvr = emailStatusTab;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$initialAction = str;
        this.$onInitialActionHandled = function0;
        this.$entry = statusTabEntry;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.mo735ContentcmhDWc(this.$topPadding, this.$bottomPadding, this.$modifier, this.$initialAction, this.$onInitialActionHandled, this.$entry, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
