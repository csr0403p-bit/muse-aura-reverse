package com.facebook.aura.main;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.G0V;
import com.facebook.aura.navigation.AuraNavKey;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HatchStatusFloatingOverlayKt {
    public static final int COMPACT_SPACE_AVATAR_SIZE_DP = 48;
    public static final int ONBOARDING_PILL_FADE_IN_DURATION_MS = 250;
    public static final int SIDE_CHAT_PILL_SLIDE_IN_DURATION_MS = 600;
    public static final int SIDE_CHAT_PILL_SLIDE_OFFSET_DP = 72;

    /* renamed from: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
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
            HatchStatusFloatingOverlayKt.HatchStatusFloatingOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchStatusFloatingOverlayKt$HatchStatusFloatingOverlay$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(BRg bRg, int i, int i2) {
            super(2);
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
            HatchStatusFloatingOverlayKt.HatchStatusFloatingOverlay(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0284 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f0 A[PHI: r16
  0x02f0: PHI (r16v5 boolean) = (r16v2 boolean), (r16v6 boolean) binds: [B:131:0x02ee, B:129:0x02ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0303 A[PHI: r16
  0x0303: PHI (r16v3 boolean) = (r16v2 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:131:0x02ee, B:132:0x02f0, B:134:0x02f6, B:139:0x0301, B:137:0x02fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0376 A[PHI: r19
  0x0376: PHI (r19v2 boolean) = (r19v0 boolean), (r19v0 boolean), (r19v3 boolean) binds: [B:56:0x0135, B:58:0x013b, B:54:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchStatusFloatingOverlay(X.BRg r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1199
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchStatusFloatingOverlayKt.HatchStatusFloatingOverlay(X.BRg, X.BFM, int, int):void");
    }

    public static final /* synthetic */ AuraNavKey access$HatchStatusFloatingOverlay$lambda$1(C1BO c1bo) {
        return (AuraNavKey) c1bo.getValue();
    }
}
