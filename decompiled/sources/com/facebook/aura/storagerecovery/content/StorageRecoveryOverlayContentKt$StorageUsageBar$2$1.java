package com.facebook.aura.storagerecovery.content;

import X.ART;
import X.AT3;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C16a;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class StorageRecoveryOverlayContentKt$StorageUsageBar$2$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ float $fraction;
    public final /* synthetic */ long $trackColor;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        long jAKb = at3.AKb();
        long jFloatToRawIntBits = Float.floatToRawIntBits(AnonymousClass001.A01(jAKb, 4294967295L) / 2.0f);
        long j = (jFloatToRawIntBits << 32) | (jFloatToRawIntBits & 4294967295L);
        long j2 = this.$trackColor;
        long jA00 = ART.A00(jAKb, 0L);
        C16a c16a = C16a.A00;
        at3.A9j(null, c16a, 1.0f, 3, j2, 0L, jA00, j);
        long jAKb2 = at3.AKb();
        float fA00 = AnonymousClass001.A00(jAKb2) * this.$fraction;
        if (fA00 > 0.0f) {
            long j3 = this.$fillColor;
            float fA01 = AnonymousClass001.A01(jAKb2, 4294967295L);
            if (fA00 < fA01) {
                fA00 = fA01;
            }
            at3.A9j(null, c16a, 1.0f, 3, j3, 0L, AnonymousClass005.A0L(fA00, fA01), j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StorageRecoveryOverlayContentKt$StorageUsageBar$2$1(long j, float f, long j2) {
        super(1);
        this.$trackColor = j;
        this.$fraction = f;
        this.$fillColor = j2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
