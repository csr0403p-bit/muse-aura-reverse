package X;

import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;

/* renamed from: X.3UC, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C3UC {
    public static final BRg A00(BRg bRg, final G0W<? super AXY, ? super C3TG, ? super Constraints, ? extends InterfaceC1134Abi> g0w) {
        return bRg.then(new Ab8<C3U6>(g0w) { // from class: X.3U8
            public final G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> A00;

            @Override // X.Ab8
            public final boolean equals(Object obj) {
                return this == obj || ((obj instanceof C3U8) && this.A00 == ((C3U8) obj).A00);
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
                G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> g0w2 = this.A00;
                C3U6 c3u6 = new C3U6();
                c3u6.A00 = g0w2;
                return c3u6;
            }

            @Override // X.Ab8
            public final int hashCode() {
                return this.A00.hashCode();
            }

            @Override // X.Ab8
            public final void inspectableProperties(ASF asf) {
                asf.A01 = AgeCheckFunnelLogging.KEY_LAYOUT;
                asf.A02.A01("measure", this.A00);
            }

            @Override // X.Ab8
            public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
                ((C3U6) abstractC1439Aj8).A00 = this.A00;
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.A00 = g0w;
            }
        });
    }
}
