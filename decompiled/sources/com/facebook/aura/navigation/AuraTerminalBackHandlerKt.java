package com.facebook.aura.navigation;

import X.AKH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B81;
import X.BBb;
import X.BFM;
import X.C1EP;
import X.C28u;
import X.C3cG;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraTerminalBackHandlerKt {
    public static final AKH<C28u> LocalAuraTerminalBackDispatcherOwner = AnonymousClass002.A0L(AuraTerminalBackHandlerKt$LocalAuraTerminalBackDispatcherOwner$1.INSTANCE);

    /* renamed from: com.facebook.aura.navigation.AuraTerminalBackHandlerKt$AuraTerminalBackHandler$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Function0<Unit> function0) {
            super(2);
            this.$enabled = z;
            this.$onBack = function0;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                B81.A00(this.$enabled, this.$onBack, bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraTerminalBackHandlerKt$AuraTerminalBackHandler$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onBack = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTerminalBackHandlerKt.AuraTerminalBackHandler(this.$enabled, this.$onBack, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void AuraTerminalBackHandler(boolean z, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object anonymousClass2;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-362011746);
        int i3 = i2 & 1;
        int iA0n = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                z = true;
            }
            Object objA6v = bfm.A6v(LocalAuraTerminalBackDispatcherOwner);
            if (objA6v == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass2 = new AuraTerminalBackHandlerKt$AuraTerminalBackHandler$dispatcherOwner$1(z, function0, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass2);
                }
                return;
            }
            AnonymousClass006.A15(bfm, C1EP.A00.A04(objA6v), new AnonymousClass1(z, function0), 698591326);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass2 = new AnonymousClass2(z, function0, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass2);
        }
    }

    public static final AKH<C28u> getLocalAuraTerminalBackDispatcherOwner() {
        return LocalAuraTerminalBackDispatcherOwner;
    }
}
