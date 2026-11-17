package androidx.camera.camera2.internal.compat;

import X.BV4;
import X.BV5;
import android.hardware.camera2.CameraAccessException;
import androidx.health.platform.client.error.ErrorCode;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
public class CameraAccessExceptionCompat extends Exception {
    public final CameraAccessException mCameraAccessException;
    public final int mReason;
    public static final Set<Integer> A01 = Collections.unmodifiableSet(BV5.A0v(new Integer[]{BV4.A0Z(), 5, BV4.A0W(), BV4.A0X(), BV4.A0Y()}));
    public static final Set<Integer> A00 = Collections.unmodifiableSet(BV5.A0v(new Integer[]{Integer.valueOf(ErrorCode.NOT_ALLOWED), Integer.valueOf(ErrorCode.EMPTY_PERMISSION_LIST)}));

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.mReason = cameraAccessException.getReason();
        this.mCameraAccessException = cameraAccessException;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CameraAccessExceptionCompat(String str, Throwable th) {
        CameraAccessException cameraAccessException;
        Integer numValueOf = Integer.valueOf(ErrorCode.EMPTY_PERMISSION_LIST);
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", numValueOf, str), th);
        this.mReason = ErrorCode.EMPTY_PERMISSION_LIST;
        if (A01.contains(numValueOf)) {
            cameraAccessException = new CameraAccessException(ErrorCode.EMPTY_PERMISSION_LIST, str, th);
        } else {
            cameraAccessException = null;
        }
        this.mCameraAccessException = cameraAccessException;
    }
}
