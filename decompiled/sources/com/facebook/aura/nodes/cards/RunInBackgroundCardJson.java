package com.facebook.aura.nodes.cards;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class RunInBackgroundCardJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String task_summary;

    public final class Companion {
        public final C9hr<RunInBackgroundCardJson> serializer() {
            return RunInBackgroundCardJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_nodes_cards_cards(RunInBackgroundCardJson runInBackgroundCardJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || runInBackgroundCardJson.task_summary != null) {
            c9j5.AAP(runInBackgroundCardJson.task_summary, C07779iq.A01, c9iZ, 0);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof RunInBackgroundCardJson) && C7384Etj.areEqual(this.task_summary, ((RunInBackgroundCardJson) obj).task_summary));
    }

    public static /* synthetic */ RunInBackgroundCardJson copy$default(RunInBackgroundCardJson runInBackgroundCardJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runInBackgroundCardJson.task_summary;
        }
        return new RunInBackgroundCardJson(str);
    }

    public final String component1() {
        return this.task_summary;
    }

    public final RunInBackgroundCardJson copy(String str) {
        return new RunInBackgroundCardJson(str);
    }

    public final String getTask_summary() {
        return this.task_summary;
    }

    public int hashCode() {
        return AnonymousClass006.A0G(this.task_summary);
    }

    public final RunInBackgroundCardData toDomain() {
        String strA0l;
        String str = this.task_summary;
        String str2 = null;
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            str2 = strA0l;
        }
        return new RunInBackgroundCardData(str2);
    }

    public /* synthetic */ RunInBackgroundCardJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.task_summary = null;
        } else {
            this.task_summary = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public RunInBackgroundCardJson(String str) {
        this.task_summary = str;
    }

    public /* synthetic */ RunInBackgroundCardJson(String str, int i, C06H c06h) {
        this(AnonymousClass006.A0r(i, str));
    }

    public RunInBackgroundCardJson() {
        this(null);
    }
}
