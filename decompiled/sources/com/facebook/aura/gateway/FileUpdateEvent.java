package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class FileUpdateEvent extends C06G {
    public static final int $stable = 0;
    public final String op;
    public final String path;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FileUpdateEvent) {
                FileUpdateEvent fileUpdateEvent = (FileUpdateEvent) obj;
                if (!C7384Etj.areEqual(this.op, fileUpdateEvent.op) || !C7384Etj.areEqual(this.path, fileUpdateEvent.path)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FileUpdateEvent copy$default(FileUpdateEvent fileUpdateEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileUpdateEvent.op;
        }
        if ((i & 2) != 0) {
            str2 = fileUpdateEvent.path;
        }
        AnonymousClass003.A0u(str, str2);
        return new FileUpdateEvent(str, str2);
    }

    public final String component1() {
        return this.op;
    }

    public final String component2() {
        return this.path;
    }

    public final String getOp() {
        return this.op;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.path, AnonymousClass001.A0G(this.op));
    }

    public FileUpdateEvent(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.op = str;
        this.path = str2;
    }

    public final FileUpdateEvent copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new FileUpdateEvent(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
