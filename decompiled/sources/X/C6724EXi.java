package X;

import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.LruCache;
import com.facebook.aura.notifications.push.AuraPushManager;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* renamed from: X.EXi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6724EXi extends AbstractC7559F3s implements Function0 {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6724EXi(int i) {
        super(0);
        this.$t = i;
    }

    public static C6724EXi A00(int i) {
        return new C6724EXi(i);
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        String str;
        int i;
        Looper mainLooper;
        HandlerThread handlerThread;
        switch (this.$t) {
            case 0:
            case 1:
                return new LruCache(64);
            case 2:
                str = "BloksScriptDispatchLowPriThread";
                i = 10;
                handlerThread = new HandlerThread(str, i);
                handlerThread.start();
                mainLooper = handlerThread.getLooper();
                return BV4.A09(mainLooper);
            case 3:
            case 23:
            case 25:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop /* 47 */:
            case 48:
                mainLooper = Looper.getMainLooper();
                return BV4.A09(mainLooper);
            case 4:
            case 29:
            case 31:
            case 35:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginTop /* 39 */:
            case 40:
            case R.styleable.maplibre_MapView_maplibre_uiLogoGravity /* 43 */:
            case 44:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft /* 45 */:
            case R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight /* 46 */:
                return AnonymousClass001.A0h();
            case 5:
                return ByteBuffer.allocateDirect(65536);
            case 6:
            case 7:
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft /* 37 */:
            default:
                return null;
            case 8:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new ThreadFactoryC2951Bpo("VideoInFlightRequestDiagnostics", 10));
                C7384Etj.A0U(executorServiceNewSingleThreadExecutor);
                return executorServiceNewSingleThreadExecutor;
            case 9:
                handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                mainLooper = handlerThread.getLooper();
                return BV4.A09(mainLooper);
            case 10:
                return new C6991Eds();
            case 11:
                return Pattern.compile("[-/ ]");
            case 12:
                return new C3110ByZ(12);
            case 13:
                return BV5.A0Z(81924);
            case 14:
                return AbstractC5245DeA.A02(C5249DeE.A00(), 81923);
            case 15:
                return AbstractC5241De6.A00(8);
            case 16:
                return BV5.A0Z(81921);
            case 17:
                C3939ChS c3939ChS = AuraPushManager.instance;
                C7384Etj.A0Z(c3939ChS, "null cannot be cast to non-null type com.facebook.pushlite.PushManager");
                return c3939ChS.A08.getValue();
            case 18:
            case 21:
                return Boolean.valueOf(C3cI.A02() - 1794445340 < 1209600);
            case 19:
                return new ConcurrentLinkedQueue();
            case 20:
                return C60O.A18();
            case 22:
                str = "ThreadUtilsBackgroundHandler";
                i = 5;
                handlerThread = new HandlerThread(str, i);
                handlerThread.start();
                mainLooper = handlerThread.getLooper();
                return BV4.A09(mainLooper);
            case 24:
                return ExecutorC3080BxM.A00;
            case 26:
            case 27:
                return AbstractC3079BxL.A00.getValue();
            case 28:
                return Executors.newSingleThreadExecutor();
            case 30:
                return Long.valueOf(SystemClock.uptimeMillis());
            case 32:
                return "";
            case 33:
                return BYg.A0L.invoke();
            case 34:
            case 36:
                return C3cI.A0O();
            case R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight /* 38 */:
                return -1;
            case R.styleable.maplibre_MapView_maplibre_uiHorizontalScrollGestures /* 41 */:
                return CD2.A02;
            case 42:
                return CD2.A06;
            case R.styleable.maplibre_MapView_maplibre_uiRotateGestures /* 49 */:
                return BV5.A0C("Bloks_ACQ_ResponseThread", -4);
        }
    }
}
