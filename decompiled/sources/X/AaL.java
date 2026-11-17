package X;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AaL extends Ab8<AaN> {
    public final PointerInputEventHandler A00;
    public final Object A01;
    public final Object A02;
    public final Object[] A03;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AaL) {
                AaL aaL = (AaL) obj;
                if (C7384Etj.areEqual(this.A01, aaL.A01) && C7384Etj.areEqual(this.A02, aaL.A02)) {
                    Object[] objArr = this.A03;
                    Object[] objArr2 = aaL.A03;
                    if (objArr != null) {
                        if (objArr2 != null && Arrays.equals(objArr, objArr2)) {
                        }
                    } else if (objArr2 != null) {
                        return false;
                    }
                    if (this.A00 == aaL.A00) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        return new AaN(this.A00, this.A01, this.A02, this.A03);
    }

    @Override // X.Ab8
    public final int hashCode() {
        int iA01 = ((C60R.A01(this.A01) * 31) + C60R.A01(this.A02)) * 31;
        Object[] objArr = this.A03;
        return AnonymousClass005.A0G(this.A00, (iA01 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31);
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        asf.A01 = "pointerInput";
        BHD bhd = asf.A02;
        bhd.A01("key1", this.A01);
        bhd.A01("key2", this.A02);
        bhd.A01(BrowserOperationCatalogKt.KEYS, this.A03);
        bhd.A01("pointerInputEventHandler", this.A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        AaN aaN = (AaN) abstractC1439Aj8;
        Object obj = this.A01;
        Object obj2 = this.A02;
        Object[] objArr = this.A03;
        PointerInputEventHandler pointerInputEventHandler = this.A00;
        boolean z = !C7384Etj.areEqual(aaN.A03, obj);
        aaN.A03 = obj;
        if (!C7384Etj.areEqual(aaN.A04, obj2)) {
            z = true;
        }
        aaN.A04 = obj2;
        Object[] objArr2 = aaN.A05;
        if (objArr2 == null ? objArr != null : !(objArr != null && Arrays.equals(objArr, objArr2))) {
            z = true;
        }
        aaN.A05 = objArr;
        if (aaN.A02.getClass() != pointerInputEventHandler.getClass() || z) {
            aaN.AbO();
        }
        aaN.A02 = pointerInputEventHandler;
    }

    public AaL(PointerInputEventHandler pointerInputEventHandler, Object obj, Object obj2, Object[] objArr) {
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = objArr;
        this.A00 = pointerInputEventHandler;
    }
}
