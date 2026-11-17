package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes5.dex */
public abstract class Bzi extends DSZ {
    public static final MappedByteBuffer A00(String str) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        File fileA0G = BV4.A0G(str);
        try {
            FileInputStream fileInputStreamA0H = BV4.A0H(fileA0G);
            try {
                FileChannel channel = fileInputStreamA0H.getChannel();
                try {
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    map.order(ByteOrder.LITTLE_ENDIAN);
                    String strA00 = AbstractC2977Bqe.A00(map, (int) fileA0G.length());
                    if (strA00.isEmpty()) {
                        channel.close();
                        fileInputStreamA0H.close();
                        return map;
                    }
                    CFK.A0H("MobileConfigMmapHandle", "Cannot validate \"%s\", err:%s", str, strA00);
                    channel.close();
                    fileInputStreamA0H.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            CFK.A0D("MobileConfigMmapHandle", "Cannot open \"%s\"", e, str);
            return null;
        }
    }
}
