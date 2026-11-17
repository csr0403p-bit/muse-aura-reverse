package com.facebook.stash.core;

import X.C3292C9w;
import java.io.File;
import java.util.List;

/* loaded from: classes5.dex */
public interface FileStash extends Stash {
    boolean createSymlinksForKey(String str, List<String> list);

    long creationTime(String str);

    File getFile(String str);

    File getFilePath(String str);

    C3292C9w getItemAttributes(String str);

    File insertFile(String str);
}
