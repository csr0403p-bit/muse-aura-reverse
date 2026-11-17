package com.facebook.aura.devices.intf;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C78N;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class DiscoveredDeviceClassifierKt {

    /* renamed from: com.facebook.aura.devices.intf.DiscoveredDeviceClassifierKt$DiscoveredDeviceScanStatus$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            DiscoveredDeviceClassifierKt.DiscoveredDeviceScanStatus(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DiscoveredDeviceScanStatus(BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass1;
        bfm.AgG(-1267974025);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = DiscoveredDeviceClassifiers.INSTANCE.resolve();
                bfm.Ai0(objAaT);
            }
            DiscoveredDeviceClassifier discoveredDeviceClassifier = (DiscoveredDeviceClassifier) objAaT;
            if (discoveredDeviceClassifier == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass1 = new DiscoveredDeviceClassifierKt$DiscoveredDeviceScanStatus$classifier$2(bRg, i, i2);
                    bBbAAc.A06 = anonymousClass1;
                }
                return;
            }
            discoveredDeviceClassifier.ScanStatus(bRg, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass1 = new AnonymousClass1(bRg, i, i2);
            bBbAAc.A06 = anonymousClass1;
        }
    }
}
