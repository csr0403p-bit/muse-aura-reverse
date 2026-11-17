package com.facebook.aura.library.repo;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class SystemSurfaceKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SystemSurfaceKey[] $VALUES;
    public static final SystemSurfaceKey CHAT;
    public static final Companion Companion;
    public static final SystemSurfaceKey FEED;
    public static final SystemSurfaceKey GOALS;
    public static final SystemSurfaceKey IDEAS;
    public static final SystemSurfaceKey LIBRARY;
    public final String key;

    static {
        SystemSurfaceKey systemSurfaceKey = new SystemSurfaceKey("CHAT", 0, "chat");
        CHAT = systemSurfaceKey;
        SystemSurfaceKey systemSurfaceKey2 = new SystemSurfaceKey("IDEAS", 1, "ideas");
        IDEAS = systemSurfaceKey2;
        SystemSurfaceKey systemSurfaceKey3 = new SystemSurfaceKey("GOALS", 2, "goals");
        GOALS = systemSurfaceKey3;
        SystemSurfaceKey systemSurfaceKey4 = new SystemSurfaceKey("LIBRARY", 3, "library");
        LIBRARY = systemSurfaceKey4;
        SystemSurfaceKey systemSurfaceKey5 = new SystemSurfaceKey("FEED", 4, "feed");
        FEED = systemSurfaceKey5;
        SystemSurfaceKey[] systemSurfaceKeyArr = {systemSurfaceKey, systemSurfaceKey2, systemSurfaceKey3, systemSurfaceKey4, systemSurfaceKey5};
        $VALUES = systemSurfaceKeyArr;
        $ENTRIES = new F3w(systemSurfaceKeyArr);
        Companion = new Companion();
    }

    public static Ey9<SystemSurfaceKey> getEntries() {
        return $ENTRIES;
    }

    public static SystemSurfaceKey valueOf(String str) {
        return (SystemSurfaceKey) Enum.valueOf(SystemSurfaceKey.class, str);
    }

    public static SystemSurfaceKey[] values() {
        return (SystemSurfaceKey[]) $VALUES.clone();
    }

    public final String getKey() {
        return this.key;
    }

    public final class Companion {
        public final SystemSurfaceKey fromKey(String str) {
            SystemSurfaceKey next;
            C7384Etj.A0Y(str, 0);
            Iterator<SystemSurfaceKey> it = SystemSurfaceKey.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getKey())) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SystemSurfaceKey(String str, int i, String str2) {
        this.key = str2;
    }
}
