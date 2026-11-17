package X;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.BSr, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2291BSr implements Ht9, G0U {
    public final int $t;
    public final Object A00;

    public C2291BSr(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                C9dz c9dz = (C9dz) this.A00;
                C9e5 c9e5 = (C9e5) obj;
                C7384Etj.A0Y(c9e5, 1);
                List<? extends Annotation> list = c9dz.A00;
                C7384Etj.A0Y(list, 0);
                c9e5.A00 = list;
                break;
            case 1:
                C9iZ c9iZ = (C9iZ) this.A00;
                int iA0F = AnonymousClass001.A0F(obj);
                return FGI.A0U(c9iZ.AF5(iA0F), ": ", c9iZ.AF3(iA0F).AKP());
            case 2:
                C9uA c9uA = (C9uA) this.A00;
                C9e5 c9e52 = (C9e5) obj;
                C7384Etj.A0Y(c9e52, 1);
                C9iZ descriptor = c9uA.A00.getDescriptor();
                C0881AGi c0881AGi = C0881AGi.A00;
                C9e5.A00("first", c0881AGi, c9e52, descriptor, false);
                C9e5.A00("second", c0881AGi, c9e52, c9uA.A01.getDescriptor(), false);
                C9e5.A00("third", c0881AGi, c9e52, c9uA.A02.getDescriptor(), false);
                break;
            case 3:
                C9sN c9sN = (C9sN) this.A00;
                JsonElement jsonElement = (JsonElement) obj;
                C7384Etj.A0Y(jsonElement, 1);
                c9sN.A07((String) AbstractC0878AGe.A0H(((C9sL) c9sN).A00), jsonElement);
                break;
            default:
                C10543Hqv c10543Hqv = (C10543Hqv) this.A00;
                C7384Etj.A0Y(obj, 1);
                c10543Hqv.element = obj;
                break;
        }
        return Unit.INSTANCE;
    }
}
