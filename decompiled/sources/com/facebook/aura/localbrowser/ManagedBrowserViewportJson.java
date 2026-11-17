package com.facebook.aura.localbrowser;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06H;
import X.C2hx;
import X.C60O;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ManagedBrowserViewportJson {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final int height;
    public final long scroll_max;
    public final long scroll_y;
    public final int width;

    public final class Companion {
        public final C9hr<ManagedBrowserViewportJson> serializer() {
            return ManagedBrowserViewportJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ ManagedBrowserViewportJson copy$default(ManagedBrowserViewportJson managedBrowserViewportJson, int i, int i2, long j, long j2, int i3, Object obj) {
        int i4 = i;
        int i5 = i2;
        long j3 = j;
        long j4 = j2;
        if ((i3 & 1) != 0) {
            i4 = managedBrowserViewportJson.width;
        }
        if ((i3 & 2) != 0) {
            i5 = managedBrowserViewportJson.height;
        }
        if ((i3 & 4) != 0) {
            j3 = managedBrowserViewportJson.scroll_y;
        }
        if ((i3 & 8) != 0) {
            j4 = managedBrowserViewportJson.scroll_max;
        }
        return new ManagedBrowserViewportJson(i4, i5, j3, j4);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_localbrowser_localbrowser(ManagedBrowserViewportJson managedBrowserViewportJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAK(c9iZ, 0, managedBrowserViewportJson.width);
        c9j5.AAK(c9iZ, 1, managedBrowserViewportJson.height);
        c9j5.AAN(c9iZ, 2, managedBrowserViewportJson.scroll_y);
        c9j5.AAN(c9iZ, 3, managedBrowserViewportJson.scroll_max);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ManagedBrowserViewportJson) {
                ManagedBrowserViewportJson managedBrowserViewportJson = (ManagedBrowserViewportJson) obj;
                if (this.width != managedBrowserViewportJson.width || this.height != managedBrowserViewportJson.height || this.scroll_y != managedBrowserViewportJson.scroll_y || this.scroll_max != managedBrowserViewportJson.scroll_max) {
                }
            }
            return false;
        }
        return true;
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final long component3() {
        return this.scroll_y;
    }

    public final long component4() {
        return this.scroll_max;
    }

    public final ManagedBrowserViewportJson copy(int i, int i2, long j, long j2) {
        return new ManagedBrowserViewportJson(i, i2, j, j2);
    }

    public final int getHeight() {
        return this.height;
    }

    public final long getScroll_max() {
        return this.scroll_max;
    }

    public final long getScroll_y() {
        return this.scroll_y;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return C8j4.A0B(this.scroll_max, AnonymousClass006.A06(this.scroll_y, ((this.width * 31) + this.height) * 31));
    }

    public String toString() {
        int i = this.width;
        int i2 = this.height;
        long j = this.scroll_y;
        long j2 = this.scroll_max;
        StringBuilder sbA0y = C60O.A0y("ManagedBrowserViewportJson(width=", i);
        sbA0y.append(", height=");
        sbA0y.append(i2);
        sbA0y.append(", scroll_y=");
        sbA0y.append(j);
        sbA0y.append(", scroll_max=");
        sbA0y.append(j2);
        return AnonymousClass001.A0v(")", sbA0y);
    }

    public ManagedBrowserViewportJson(int i, int i2, long j, long j2) {
        this.width = i;
        this.height = i2;
        this.scroll_y = j;
        this.scroll_max = j2;
    }

    public /* synthetic */ ManagedBrowserViewportJson(int i, int i2, int i3, long j, long j2, C2hx c2hx) {
        if (15 != (i & 15)) {
            C9iI.A00(ManagedBrowserViewportJson$$serializer.descriptor, i, 15);
            throw F60.createAndThrow();
        }
        this.width = i2;
        this.height = i3;
        this.scroll_y = j;
        this.scroll_max = j2;
    }
}
