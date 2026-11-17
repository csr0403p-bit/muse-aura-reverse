package X;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.os.Build;
import android.os.CancellationSignal;
import com.facebook.analytics2.healthcounter.HCLogDataStruct;
import com.facebook.aura.notifications.push.AuraPushTokenSender;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.rsys.rtc.RSVideoFrame;
import com.facebook.tigon.TigonRequestToken;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import org.webrtc.VideoFrame;

/* loaded from: classes5.dex */
public final class EQe extends AbstractC7559F3s implements G0U {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EQe(Object obj, int i) {
        super(1);
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, X.DZy] */
    /* JADX WARN: Type inference failed for: r7v13, types: [T, com.google.common.util.concurrent.ListenableFuture<java.lang.Void>] */
    /* JADX WARN: Type inference failed for: r7v14, types: [T, X.Bha] */
    /* JADX WARN: Type inference failed for: r7v15, types: [T, kotlin.Unit] */
    /* JADX WARN: Type inference failed for: r7v2, types: [T, X.4Ax] */
    /* JADX WARN: Type inference failed for: r7v5, types: [T, X.7mj] */
    /* JADX WARN: Type inference failed for: r7v6, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v9, types: [T, java.lang.Object] */
    @Override // X.G0U
    public final /* bridge */ /* synthetic */ T invoke(T t) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        boolean zBooleanValue;
        Object objInvoke;
        InterfaceC5106DYe interfaceC5106DYe;
        switch (this.$t) {
            case 0:
                C2679Bhc c2679Bhc = (C2679Bhc) t;
                ?? r7 = C2678Bha.A07;
                if (c2679Bhc == null) {
                    C7384Etj.A0a("LOAD_PARAM");
                    throw F60.createAndThrow();
                }
                r7.A01 = c2679Bhc;
                Context contextA00 = Bq3.A00((Context) this.A00);
                C7384Etj.A0U(contextA00);
                r7.A00 = contextA00;
                return r7;
            case 1:
                return ((C2679Bhc) this.A00).A0A;
            case 2:
                if (t != 0) {
                    ((CancellationSignal) this.A00).cancel();
                }
                return Unit.INSTANCE;
            case 3:
                Canvas canvas = (Canvas) t;
                C7384Etj.A0Y(canvas, 0);
                EGP egp = (EGP) this.A00;
                super/*X.FHQ*/.dispatchDraw(canvas);
                if (egp.A07 && Build.VERSION.SDK_INT >= 33) {
                    EGP.A00(canvas, egp);
                }
                return Unit.INSTANCE;
            case 4:
                Canvas canvas2 = (Canvas) t;
                C7384Etj.A0Y(canvas2, 0);
                super/*X.FHQ*/.dispatchDraw(canvas2);
                return Unit.INSTANCE;
            case 5:
                ((TigonRequestToken) this.A00).cancel();
                return Unit.INSTANCE;
            case 6:
                C7384Etj.A0Y(t, 0);
                HCLogDataStruct hCLogDataStruct = (HCLogDataStruct) t;
                if (C4950DGx.A05 == null) {
                    C7384Etj.A0b("writeLatch");
                    throw F60.createAndThrow();
                }
                FFSingletonJNILogger.bumpHealthCountersWithDebugInfo(hCLogDataStruct.identitiesDescriptor, hCLogDataStruct.key, hCLogDataStruct.eventName, hCLogDataStruct.traceId, hCLogDataStruct.debugData, hCLogDataStruct.value);
                return Unit.INSTANCE;
            case 7:
                interfaceC5106DYe = (InterfaceC5106DYe) C8j3.A10((AtomicReference) this.A00);
                if (interfaceC5106DYe != null) {
                    interfaceC5106DYe.cancel();
                }
                return Unit.INSTANCE;
            case 8:
                return C5120DZw.A01(((C5120DZw) this.A00).A07.getValue(), AnonymousClass001.A0F(t));
            case 9:
                C7384Etj.A0Y(t, 0);
                ?? NewInstance = ((Class) this.A00).getConstructor(A7O.class).newInstance(t);
                C7384Etj.A0U(NewInstance);
                return NewInstance;
            case 10:
                interfaceC5106DYe = (InterfaceC5106DYe) this.A00;
                interfaceC5106DYe.cancel();
                return Unit.INSTANCE;
            case 11:
                C7384Etj.A0Y(t, 0);
                Hm1 hm1 = (Hm1) this.A00;
                if (hm1.isActive()) {
                    hm1.resumeWith(t);
                }
                return Unit.INSTANCE;
            case 12:
                AbstractC7559F3s.A01(t).point(FGI.A0M(((AuraPushTokenSender) ((InterfaceC3957Chw) this.A00)).pushTokenSenderName, ".register_token_start"));
                return Unit.INSTANCE;
            case 13:
                VideoFrame videoFrame = (VideoFrame) t;
                C7384Etj.A0Y(videoFrame, 0);
                return Boolean.valueOf(C7384Etj.areEqual(((VideoFrame) this.A00).buffer, videoFrame.buffer));
            case 14:
                C7384Etj.A0Y(t, 0);
                RSVideoFrame rSVideoFrame = (RSVideoFrame) this.A00;
                EQe eQe = new EQe(t, 13);
                VideoFrame videoFrameAcquireVideoFrame = rSVideoFrame.acquireVideoFrame();
                if (videoFrameAcquireVideoFrame == null) {
                    objInvoke = null;
                } else {
                    try {
                        objInvoke = eQe.invoke(videoFrameAcquireVideoFrame);
                    } finally {
                        videoFrameAcquireVideoFrame.release();
                    }
                }
                Boolean bool = (Boolean) objInvoke;
                zBooleanValue = bool != null ? bool.booleanValue() : false;
                return Boolean.valueOf(zBooleanValue);
            case 15:
                EHS ehs = (EHS) t;
                C7384Etj.A0Y(ehs, 0);
                Context context = ((EHT) this.A00).A01.getContext();
                if (context != null) {
                    return C06967mj.A00(context, ehs.A00);
                }
                throw C3cG.A0Q("Null context");
            case 16:
                C5700Dnh c5700Dnh = (C5700Dnh) t;
                C7384Etj.A0Y(c5700Dnh, 0);
                c5700Dnh.A03((C5963Dsz) this.A00);
                return Unit.INSTANCE;
            case 17:
                zBooleanValue = false;
                if (new CD2[]{((CDH) this.A00).A01.A00(AnonymousClass001.A0F(t))}[0] == CD2.A04) {
                    zBooleanValue = true;
                }
                return Boolean.valueOf(zBooleanValue);
            case 18:
                DAZ.A00((DAZ) this.A00, C8j3.A13(t), null, (short) 3, true);
                return Unit.INSTANCE;
            case 19:
                PackageItemInfo packageItemInfo = (PackageItemInfo) t;
                C7384Etj.A0Y(packageItemInfo, 0);
                String str = packageItemInfo.packageName;
                C7384Etj.A0T(str);
                return new C4Ax(str, packageItemInfo.loadLabel((PackageManager) this.A00).toString());
            case 20:
            default:
                List list = (List) this.A00;
                if (list.isEmpty()) {
                    return t;
                }
                ListIterator listIteratorA0n = C3cG.A0n(list);
                T tInvoke = t;
                while (listIteratorA0n.hasPrevious()) {
                    tInvoke = ((G0U) listIteratorA0n.previous()).invoke(tInvoke);
                }
                return tInvoke;
            case 21:
                ((Future) this.A00).cancel(true);
                return Unit.INSTANCE;
        }
    }
}
