package com.facebook.pando;

import X.AnonymousClass003;
import X.C60O;
import X.ETi;
import android.content.res.AssetManager;
import com.facebook.jni.HybridClassBase;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class PandoBuildConfigFlatbufferAssetReaderJNI extends HybridClassBase {
    public static final native PandoBuildConfigFlatbufferAssetReaderJNI createFromAssetManager(String str, AssetManager assetManager, boolean z);

    public static final native PandoBuildConfigFlatbufferAssetReaderJNI createFromByteBufferNative(String str, ByteBuffer byteBuffer, boolean z);

    public static final native PandoBuildConfigFlatbufferAssetReaderJNI createFromFile(String str, String str2, boolean z);

    public final native ByteBuffer byteBuffer();

    public final native String clientDocIdForQuery(String str);

    public final native boolean isBackedByByteBuffer(ByteBuffer byteBuffer);

    public final native String schemaForQuery(String str);

    static {
        ETi.loadLibrary("pando-flatbuffer-jni");
    }

    public static final PandoBuildConfigFlatbufferAssetReaderJNI A00(String str, ByteBuffer byteBuffer, boolean z) {
        AnonymousClass003.A0u(str, byteBuffer);
        if (!byteBuffer.isDirect()) {
            throw C60O.A0i("Pando FlatBuffer must be direct");
        }
        if (!byteBuffer.isReadOnly()) {
            throw C60O.A0i("Pando FlatBuffer must be read-only");
        }
        if (byteBuffer.position() != 0) {
            throw C60O.A0i("Pando FlatBuffer position must be zero");
        }
        if (byteBuffer.limit() == byteBuffer.capacity()) {
            return createFromByteBufferNative(str, byteBuffer, z);
        }
        throw C60O.A0i("Pando FlatBuffer limit must equal capacity");
    }

    public static final PandoBuildConfigFlatbufferAssetReaderJNI createFromByteBuffer(String str, ByteBuffer byteBuffer, boolean z) {
        return A00(str, byteBuffer, z);
    }
}
