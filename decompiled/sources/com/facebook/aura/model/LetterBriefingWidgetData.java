package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class LetterBriefingWidgetData extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String id;
    public final String path;

    public final class Companion {
        public final C9hr<LetterBriefingWidgetData> serializer() {
            return LetterBriefingWidgetData$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_model_model(LetterBriefingWidgetData letterBriefingWidgetData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(letterBriefingWidgetData.id, c9iZ, 0);
        c9j5.AAV(letterBriefingWidgetData.path, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LetterBriefingWidgetData) {
                LetterBriefingWidgetData letterBriefingWidgetData = (LetterBriefingWidgetData) obj;
                if (!C7384Etj.areEqual(this.id, letterBriefingWidgetData.id) || !C7384Etj.areEqual(this.path, letterBriefingWidgetData.path)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ LetterBriefingWidgetData copy$default(LetterBriefingWidgetData letterBriefingWidgetData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = letterBriefingWidgetData.id;
        }
        if ((i & 2) != 0) {
            str2 = letterBriefingWidgetData.path;
        }
        AnonymousClass003.A0u(str, str2);
        return new LetterBriefingWidgetData(str, str2);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.path;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPath() {
        return this.path;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.path, AnonymousClass001.A0G(this.id));
    }

    public LetterBriefingWidgetData(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.id = str;
        this.path = str2;
    }

    public final LetterBriefingWidgetData copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new LetterBriefingWidgetData(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ LetterBriefingWidgetData(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(LetterBriefingWidgetData$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.id = str;
        this.path = str2;
    }
}
