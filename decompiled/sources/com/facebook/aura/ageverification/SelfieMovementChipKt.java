package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class SelfieMovementChipKt {

    /* renamed from: com.facebook.aura.ageverification.SelfieMovementChipKt$SelfieMovementChip$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HeadMovement $current;
        public final /* synthetic */ boolean $done;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ InterfaceC05151eP $this_SelfieMovementChip;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC05151eP interfaceC05151eP, HeadMovement headMovement, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$this_SelfieMovementChip = interfaceC05151eP;
            this.$current = headMovement;
            this.$done = z;
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
            SelfieMovementChipKt.SelfieMovementChip(this.$this_SelfieMovementChip, this.$current, this.$done, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeadMovement.values().length];
            try {
                AnonymousClass002.A13(HeadMovement.RIGHT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HeadMovement.UP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HeadMovement.LEFT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SelfieMovementChip(X.InterfaceC05151eP r16, com.facebook.aura.ageverification.HeadMovement r17, boolean r18, X.BRg r19, X.BFM r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ageverification.SelfieMovementChipKt.SelfieMovementChip(X.1eP, com.facebook.aura.ageverification.HeadMovement, boolean, X.BRg, X.BFM, int, int):void");
    }
}
