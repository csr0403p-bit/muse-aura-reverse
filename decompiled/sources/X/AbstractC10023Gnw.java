package X;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/* renamed from: X.Gnw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10023Gnw {
    public static final C9971Gmk[] A01 = new C9971Gmk[0];
    public static final Annotation[] A02 = new Annotation[0];
    public final AbstractC9910Gks A00;

    public final AbstractC10095GpJ A05(AbstractC10095GpJ abstractC10095GpJ, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            abstractC10095GpJ = abstractC10095GpJ.A00(annotation);
            if (this.A00.A0g(annotation)) {
                abstractC10095GpJ = A04(abstractC10095GpJ, annotation);
            }
        }
        return abstractC10095GpJ;
    }

    public final AbstractC10095GpJ A06(AbstractC10095GpJ abstractC10095GpJ, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!abstractC10095GpJ.A02(annotation)) {
                abstractC10095GpJ = abstractC10095GpJ.A00(annotation);
                AbstractC9910Gks abstractC9910Gks = this.A00;
                if (abstractC9910Gks.A0g(annotation)) {
                    for (Annotation annotation2 : AbstractC9855Gj3.A0M(annotation.annotationType())) {
                        if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention) && !abstractC10095GpJ.A02(annotation2)) {
                            abstractC10095GpJ = abstractC10095GpJ.A00(annotation2);
                            if (abstractC9910Gks.A0g(annotation2)) {
                                abstractC10095GpJ = A04(abstractC10095GpJ, annotation2);
                            }
                        }
                    }
                }
            }
        }
        return abstractC10095GpJ;
    }

    public final AbstractC10095GpJ A07(Annotation[] annotationArr) {
        AbstractC10095GpJ abstractC10095GpJA00 = C10080Gp1.A00;
        for (Annotation annotation : annotationArr) {
            abstractC10095GpJA00 = abstractC10095GpJA00.A00(annotation);
            if (this.A00.A0g(annotation)) {
                abstractC10095GpJA00 = A04(abstractC10095GpJA00, annotation);
            }
        }
        return abstractC10095GpJA00;
    }

    public AbstractC10023Gnw(AbstractC9910Gks abstractC9910Gks) {
        this.A00 = abstractC9910Gks;
    }

    private final AbstractC10095GpJ A04(AbstractC10095GpJ abstractC10095GpJ, Annotation annotation) {
        for (Annotation annotation2 : AbstractC9855Gj3.A0M(annotation.annotationType())) {
            if (!(annotation2 instanceof Target) && !(annotation2 instanceof Retention)) {
                if (!this.A00.A0g(annotation2)) {
                    abstractC10095GpJ = abstractC10095GpJ.A00(annotation2);
                } else if (!abstractC10095GpJ.A02(annotation2)) {
                    abstractC10095GpJ = A04(abstractC10095GpJ.A00(annotation2), annotation2);
                }
            }
        }
        return abstractC10095GpJ;
    }
}
