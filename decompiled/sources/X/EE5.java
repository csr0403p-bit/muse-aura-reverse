package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonErrorException;
import com.facebook.tigon.iface.TigonErrorCode;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class EE5 extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE5(Object obj, Object obj2, Object obj3, int i) {
        super(1);
        this.$t = i;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0161: INVOKE (r4v1 ?? I:android.graphics.Canvas), (r2 I:int) VIRTUAL call: android.graphics.Canvas.restoreToCount(int):void A[Catch: all -> 0x0178, MD:(int):void (c)] (LINE:353), block:B:81:0x0161 */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Canvas canvas;
        int iSave;
        int iSave2;
        Paint paint;
        int i;
        switch (this.$t) {
            case 0:
                Throwable th = (Throwable) obj;
                C7384Etj.A0Y(th, 0);
                if (BV4.A1V((AtomicBoolean) this.A00)) {
                    TigonError tigonErrorA00 = TigonErrorException.A00(th);
                    boolean z = (tigonErrorA00 != null ? tigonErrorA00.category : null) == TigonErrorCode.A08;
                    G0U g0u = (G0U) this.A01;
                    if (!z) {
                        g0u.invoke(th);
                        break;
                    } else {
                        String message = th.getMessage();
                        if (message == null) {
                            message = C3cI.A0Y(th);
                        }
                        g0u.invoke(new Throwable(FGI.A0M("Persistent network error occurred during request: ", message), th));
                        break;
                    }
                }
                break;
            case 1:
                Matrix matrix = (Matrix) obj;
                C7384Etj.A0Y(matrix, 0);
                canvas = (Canvas) this.A00;
                EtV etV = (EtV) this.A02;
                C7377EtL c7377EtL = (C7377EtL) this.A01;
                iSave = canvas.save();
                canvas.concat(matrix);
                try {
                    C7376EtK c7376EtK = etV.A01;
                    int iA00 = 0;
                    if (c7376EtK == null) {
                        if (!etV.A03) {
                            List<InterfaceC7487Exq> list = etV.A02;
                            int size = list.size();
                            while (iA00 < size) {
                                iA00 = InterfaceC7487Exq.A00(canvas, c7377EtL, list, iA00);
                            }
                            break;
                        } else {
                            long j = etV.A00;
                            float fA03 = AnonymousClass003.A03(j);
                            float fA00 = AnonymousClass004.A00(j);
                            iSave2 = canvas.save();
                            canvas.clipRect(0.0f, 0.0f, fA03, fA00);
                            List<InterfaceC7487Exq> list2 = etV.A02;
                            int size2 = list2.size();
                            while (iA00 < size2) {
                                iA00 = InterfaceC7487Exq.A00(canvas, c7377EtL, list2, iA00);
                            }
                        }
                    } else {
                        Path pathA00 = c7377EtL.A00(c7376EtK);
                        iSave2 = canvas.save();
                        canvas.clipPath(pathA00);
                        List<InterfaceC7487Exq> list3 = etV.A02;
                        int size3 = list3.size();
                        while (iA00 < size3) {
                            iA00 = InterfaceC7487Exq.A00(canvas, c7377EtL, list3, iA00);
                        }
                    }
                    canvas.restoreToCount(iSave2);
                } catch (Throwable th2) {
                    throw th2;
                } finally {
                }
            default:
                Matrix matrix2 = (Matrix) obj;
                C7384Etj.A0Y(matrix2, 0);
                EtQ etQ = (EtQ) this.A02;
                float f = etQ.A00;
                if (f == 1.0f && etQ.A01 == 3) {
                    paint = null;
                } else {
                    C7377EtL c7377EtL2 = (C7377EtL) this.A01;
                    paint = c7377EtL2.A01;
                    if (paint == null) {
                        paint = new Paint(7);
                        c7377EtL2.A01 = paint;
                    }
                    EtQ etQ2 = c7377EtL2.A04;
                    if ((etQ2 == null || f != etQ2.A00) && paint.getAlpha() != (i = (int) (f * 255.0f))) {
                        paint.setAlpha(i);
                    }
                    int i2 = etQ.A01;
                    EtQ etQ3 = c7377EtL2.A04;
                    if (etQ3 == null || i2 != etQ3.A01) {
                        AbstractC8733FjY.A01(i2, paint);
                    }
                    c7377EtL2.A04 = etQ;
                }
                canvas = (Canvas) this.A00;
                C7377EtL c7377EtL3 = (C7377EtL) this.A01;
                iSave = canvas.save();
                canvas.concat(matrix2);
                try {
                    long j2 = etQ.A02;
                    int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, 0.0f + AnonymousClass003.A03(j2), 0.0f + AnonymousClass004.A00(j2), paint, 31);
                    try {
                        C7376EtK c7376EtK2 = etQ.A03;
                        int iA002 = 0;
                        if (c7376EtK2 != null) {
                            Path pathA002 = c7377EtL3.A00(c7376EtK2);
                            iSave = canvas.save();
                            canvas.clipPath(pathA002);
                            try {
                                List<InterfaceC7487Exq> list4 = etQ.A04;
                                int size4 = list4.size();
                                while (iA002 < size4) {
                                    iA002 = InterfaceC7487Exq.A00(canvas, c7377EtL3, list4, iA002);
                                }
                                canvas.restoreToCount(iSave);
                            } finally {
                            }
                        } else {
                            List<InterfaceC7487Exq> list5 = etQ.A04;
                            int size5 = list5.size();
                            while (iA002 < size5) {
                                iA002 = InterfaceC7487Exq.A00(canvas, c7377EtL3, list5, iA002);
                            }
                        }
                        return Unit.INSTANCE;
                    } finally {
                        canvas.restoreToCount(iSaveLayer);
                    }
                } finally {
                }
        }
        return Unit.INSTANCE;
    }
}
