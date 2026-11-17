package com.facebook.stash.core;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public interface Stash {
    Set<String> getAllKeys();

    @Deprecated(message = "")
    File getBaseStoragePath_ForInternalUse();

    int getItemCount();

    long getItemSizeBytes(String str);

    long getSizeBytes();

    boolean hasKey(String str);

    long lastAccessTime(String str);

    InputStream read(String str);

    byte[] readResourceToMemory(String str);

    byte[] readResourceToMemory(String str, int i);

    boolean remove(String str);

    boolean remove(String str, int i);

    boolean removeAll();

    boolean touch(String str);

    OutputStream write(String str);

    void write(String str, byte[] bArr);

    void write(String str, byte[] bArr, List<String> list);
}
