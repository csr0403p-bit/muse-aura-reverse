package X;

import android.content.Context;
import com.facebook.analytics2.logger.interfaces.DefaultHandlerThreadFactory;
import com.facebook.flexiblesampling.SamplingPolicyConfig;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.Ckr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4048Ckr implements InterfaceC4935DFn<ByteArrayOutputStream> {
    public ByteArrayOutputStream A00;
    public boolean A01;
    public HandlerC4047Ckq A02;
    public final C3336CFf A03;
    public final C4061Cl4 A04;
    public final InterfaceC4012Cjq A05;
    public final InterfaceC4071ClJ A06;
    public final SamplingPolicyConfig A07;
    public final long A08;
    public final Context A09;
    public final DGD A0A;
    public final DefaultHandlerThreadFactory A0B;

    private HandlerC4047Ckq A00() {
        HandlerC4047Ckq handlerC4047Ckq = this.A02;
        if (handlerC4047Ckq != null) {
            return handlerC4047Ckq;
        }
        HandlerC4047Ckq handlerC4047Ckq2 = new HandlerC4047Ckq(BV5.A0C("Analytics-NormalPri-InMemory-Scheduler", 10).getLooper(), this);
        this.A02 = handlerC4047Ckq2;
        return handlerC4047Ckq2;
    }

    @Override // X.InterfaceC4935DFn
    public final void ARL() {
        if (this.A00 == null) {
            throw C3cG.A0Q("mByteArrayOutputStream is null");
        }
        HandlerC4047Ckq handlerC4047CkqA00 = A00();
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        handlerC4047CkqA00.removeMessages(1, byteArrayOutputStream);
        BV4.A1D(handlerC4047CkqA00, byteArrayOutputStream, 1);
    }

    @Override // X.InterfaceC4935DFn
    public final void ARN(C4932DFh c4932DFh) {
        if (this.A00 == null) {
            throw C3cG.A0Q("mByteArrayOutputStream is null");
        }
        if (this.A01) {
            return;
        }
        this.A01 = true;
        HandlerC4047Ckq handlerC4047CkqA00 = A00();
        ByteArrayOutputStream byteArrayOutputStream = this.A00;
        handlerC4047CkqA00.sendMessageDelayed(handlerC4047CkqA00.obtainMessage(1, byteArrayOutputStream), this.A08);
    }

    @Override // X.InterfaceC4935DFn
    public final void ARU(String str) {
        if (this.A00 != null) {
            HandlerC4047Ckq handlerC4047CkqA00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            handlerC4047CkqA00.removeMessages(1, byteArrayOutputStream);
            BV4.A1D(handlerC4047CkqA00, byteArrayOutputStream, 1);
        }
    }

    @Override // X.InterfaceC4935DFn
    public final /* bridge */ /* synthetic */ void Adb(ByteArrayOutputStream byteArrayOutputStream) {
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        if (this.A00 != byteArrayOutputStream2) {
            this.A00 = byteArrayOutputStream2;
            this.A01 = false;
        }
    }

    @Override // X.InterfaceC4935DFn
    public final void AhQ() {
        if (this.A00 != null) {
            HandlerC4047Ckq handlerC4047CkqA00 = A00();
            ByteArrayOutputStream byteArrayOutputStream = this.A00;
            handlerC4047CkqA00.removeMessages(1, byteArrayOutputStream);
            BV4.A1D(handlerC4047CkqA00, byteArrayOutputStream, 1);
        }
    }

    public C4048Ckr(Context context, DGD dgd, C4061Cl4 c4061Cl4, C3339CFj c3339CFj, long j) {
        SamplingPolicyConfig samplingPolicyConfig;
        this.A09 = context;
        this.A04 = c4061Cl4;
        this.A08 = j;
        this.A0A = dgd;
        try {
            C4046Ckp c4046CkpA00 = C4046Ckp.A00(context);
            this.A05 = (InterfaceC4012Cjq) C4046Ckp.A01(c4046CkpA00, c4061Cl4.A02.getName(), c4046CkpA00.A05);
            Class<? extends SamplingPolicyConfig> cls = c4061Cl4.A01;
            InterfaceC4071ClJ interfaceC4071ClJ = null;
            if (cls == null) {
                samplingPolicyConfig = null;
            } else {
                C4046Ckp c4046CkpA002 = C4046Ckp.A00(context);
                samplingPolicyConfig = (SamplingPolicyConfig) C4046Ckp.A02(c4046CkpA002, cls.getName(), c4046CkpA002.A03);
            }
            this.A07 = samplingPolicyConfig;
            Class<? extends InterfaceC4071ClJ> cls2 = c4061Cl4.A00;
            if (cls2 != null) {
                C4046Ckp c4046CkpA003 = C4046Ckp.A00(context);
                interfaceC4071ClJ = (InterfaceC4071ClJ) C4046Ckp.A02(c4046CkpA003, cls2.getName(), c4046CkpA003.A02);
            }
            this.A06 = interfaceC4071ClJ;
            this.A0B = C4046Ckp.A00(context).A05(DefaultHandlerThreadFactory.class.getName());
            this.A03 = new C3336CFf(context, c3339CFj, samplingPolicyConfig, c4061Cl4.A04);
        } catch (IllegalAccessException e) {
            throw C4061Cl4.A00(this.A04, e);
        } catch (InstantiationException e2) {
            throw C4061Cl4.A00(this.A04, e2);
        } catch (NoSuchMethodException e3) {
            throw C4061Cl4.A00(this.A04, e3);
        } catch (InvocationTargetException e4) {
            throw C4061Cl4.A00(this.A04, e4);
        }
    }

    @Override // X.InterfaceC4935DFn
    public final void ARM() {
        throw F60.createAndThrow();
    }
}
