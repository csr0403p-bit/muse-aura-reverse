package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.model.AiIdentity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class IdentityScreenKt$IdentityContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ String $content;
    public final /* synthetic */ AiIdentity $identity;
    public final /* synthetic */ boolean $isRefreshing;
    public final /* synthetic */ String $memoryModifiedDate;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<String, Unit> $onOpenFile;
    public final /* synthetic */ Function0<Unit> $onRefresh;
    public final /* synthetic */ String $soulModifiedDate;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IdentityScreenKt$IdentityContent$2(AiIdentity aiIdentity, String str, boolean z, Function0<Unit> function0, G0U<? super String, Unit> g0u, String str2, String str3, float f, float f2, BRg bRg, int i, int i2) {
        super(2);
        this.$identity = aiIdentity;
        this.$content = str;
        this.$isRefreshing = z;
        this.$onRefresh = function0;
        this.$onOpenFile = g0u;
        this.$soulModifiedDate = str2;
        this.$memoryModifiedDate = str3;
        this.$topPadding = f;
        this.$bottomPadding = f2;
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
        IdentityScreenKt.m2244IdentityContentKBW6s6s(this.$identity, this.$content, this.$isRefreshing, this.$onRefresh, this.$onOpenFile, this.$soulModifiedDate, this.$memoryModifiedDate, this.$topPadding, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
