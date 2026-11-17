package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Arrays;

/* renamed from: X.Gpa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10109Gpa {
    public final boolean A00;

    public AbstractC10109Gpa() {
        this.A00 = false;
    }

    public final JsonSerializer<Object> A00(Class<?> cls) {
        if (this instanceof C10111Gpc) {
            C10111Gpc c10111Gpc = (C10111Gpc) this;
            if (cls == c10111Gpc.A01) {
                return c10111Gpc.A00;
            }
            return null;
        }
        if (!(this instanceof C10112Gpd)) {
            if (this instanceof C10110Gpb) {
                return null;
            }
            C10113Gpe c10113Gpe = (C10113Gpe) this;
            if (cls == c10113Gpe.A02) {
                return c10113Gpe.A00;
            }
            if (cls == c10113Gpe.A03) {
                return c10113Gpe.A01;
            }
            return null;
        }
        C10132Gpx[] c10132GpxArr = ((C10112Gpd) this).A00;
        C10132Gpx c10132Gpx = c10132GpxArr[0];
        if (c10132Gpx.A01 != cls) {
            c10132Gpx = c10132GpxArr[1];
            if (c10132Gpx.A01 != cls) {
                c10132Gpx = c10132GpxArr[2];
                if (c10132Gpx.A01 != cls) {
                    switch (c10132GpxArr.length) {
                        case 8:
                            c10132Gpx = c10132GpxArr[7];
                            if (c10132Gpx.A01 != cls) {
                            }
                            break;
                        case 7:
                            c10132Gpx = c10132GpxArr[6];
                            if (c10132Gpx.A01 != cls) {
                            }
                            break;
                        case 6:
                            c10132Gpx = c10132GpxArr[5];
                            if (c10132Gpx.A01 != cls) {
                            }
                            break;
                        case 5:
                            c10132Gpx = c10132GpxArr[4];
                            if (c10132Gpx.A01 != cls) {
                            }
                            break;
                        case 4:
                            c10132Gpx = c10132GpxArr[3];
                            if (c10132Gpx.A01 != cls) {
                                return null;
                            }
                            break;
                        default:
                            return null;
                    }
                }
            }
        }
        return c10132Gpx.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)LX/Gpa; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.Gpa] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public final AbstractC10109Gpa A01(JsonSerializer jsonSerializer, Class cls) {
        ?? r5;
        if (this instanceof C10111Gpc) {
            C10111Gpc c10111Gpc = (C10111Gpc) this;
            return new C10113Gpe(c10111Gpc.A00, jsonSerializer, c10111Gpc, c10111Gpc.A01, cls);
        }
        if (this instanceof C10112Gpd) {
            C10112Gpd c10112Gpd = (C10112Gpd) this;
            C10132Gpx[] c10132GpxArr = c10112Gpd.A00;
            int length = c10132GpxArr.length;
            if (length != 8) {
                C10132Gpx[] c10132GpxArr2 = (C10132Gpx[]) Arrays.copyOf(c10132GpxArr, length + 1);
                c10132GpxArr2[length] = new C10132Gpx(jsonSerializer, cls);
                return new C10112Gpd(c10112Gpd, c10132GpxArr2);
            }
            boolean z = ((AbstractC10109Gpa) c10112Gpd).A00;
            r5 = c10112Gpd;
            if (!z) {
                return c10112Gpd;
            }
        } else {
            boolean z2 = this instanceof C10110Gpb;
            this = this;
            if (!z2) {
                C10113Gpe c10113Gpe = (C10113Gpe) this;
                return new C10112Gpd(c10113Gpe, new C10132Gpx[]{new C10132Gpx(c10113Gpe.A00, c10113Gpe.A02), new C10132Gpx(c10113Gpe.A01, c10113Gpe.A03), new C10132Gpx(jsonSerializer, cls)});
            }
        }
        return new C10111Gpc(jsonSerializer, r5, cls);
    }

    public AbstractC10109Gpa(AbstractC10109Gpa abstractC10109Gpa) {
        this.A00 = abstractC10109Gpa.A00;
    }
}
