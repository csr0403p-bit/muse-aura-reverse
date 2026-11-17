package com.facebook.acra.util;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public interface OutputStreamFactory {
    OutputStream create(OutputStream outputStream);

    void finish(OutputStream outputStream);
}
