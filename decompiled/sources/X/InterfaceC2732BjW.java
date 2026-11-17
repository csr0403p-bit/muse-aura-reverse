package X;

import android.hardware.camera2.CameraDevice;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;

/* renamed from: X.BjW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC2732BjW {
    boolean AOV();

    void API(List<C2646Bgd> list);

    /* JADX WARN: Incorrect types in method signature: (LX/Bga;Landroid/hardware/camera2/CameraDevice;LX/BlQ;)Lcom/google/common/util/concurrent/ListenableFuture<Ljava/lang/Void;>; */
    ListenableFuture AXV(CameraDevice cameraDevice, BlQ blQ, C2643Bga c2643Bga);

    ListenableFuture<Void> Aa7(boolean z);

    void Aed(C2643Bga c2643Bga);

    void close();
}
