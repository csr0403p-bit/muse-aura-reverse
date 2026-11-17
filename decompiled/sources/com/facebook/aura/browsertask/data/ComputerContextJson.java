package com.facebook.aura.browsertask.data;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes3.dex */
public final class ComputerContextJson {
    public static final int $stable = 8;
    public final DesktopImageJson default_desktop_image;
    public final List<JsonElement> tasks;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1X(C79.A01, new Function0() { // from class: com.facebook.aura.browsertask.data.ComputerContextJson$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = ComputerContextJson.$stable;
            return C3cG.A18();
        }
    });

    public final class Companion {
        public final C9hr<ComputerContextJson> serializer() {
            return ComputerContextJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComputerContextJson(List<? extends JsonElement> list, DesktopImageJson desktopImageJson) {
        C7384Etj.A0Y(list, 0);
        this.tasks = list;
        this.default_desktop_image = desktopImageJson;
    }

    public final ComputerContextJson copy(List<? extends JsonElement> list, DesktopImageJson desktopImageJson) {
        C7384Etj.A0Y(list, 0);
        return new ComputerContextJson(list, desktopImageJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ComputerContextJson) {
                ComputerContextJson computerContextJson = (ComputerContextJson) obj;
                if (!C7384Etj.areEqual(this.tasks, computerContextJson.tasks) || !C7384Etj.areEqual(this.default_desktop_image, computerContextJson.default_desktop_image)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ComputerContextJson copy$default(ComputerContextJson computerContextJson, List list, DesktopImageJson desktopImageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = computerContextJson.tasks;
        }
        if ((i & 2) != 0) {
            desktopImageJson = computerContextJson.default_desktop_image;
        }
        C7384Etj.A0Y(list, 0);
        return new ComputerContextJson(list, desktopImageJson);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_browsertask_data_data(ComputerContextJson computerContextJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(computerContextJson.tasks)) {
            c9j5.AAQ(computerContextJson.tasks, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || computerContextJson.default_desktop_image != null) {
            c9j5.AAP(computerContextJson.default_desktop_image, DesktopImageJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final List<JsonElement> component1() {
        return this.tasks;
    }

    public final DesktopImageJson component2() {
        return this.default_desktop_image;
    }

    public final DesktopImageJson getDefault_desktop_image() {
        return this.default_desktop_image;
    }

    public final List<JsonElement> getTasks() {
        return this.tasks;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.tasks) + AnonymousClass006.A0D(this.default_desktop_image);
    }

    public String toString() {
        return C3cJ.A0L(this.default_desktop_image, ", default_desktop_image=", C3cG.A0f(this.tasks, "ComputerContextJson(tasks="));
    }

    public /* synthetic */ ComputerContextJson(int i, List list, DesktopImageJson desktopImageJson, C2hx c2hx) {
        this.tasks = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.default_desktop_image = null;
        } else {
            this.default_desktop_image = desktopImageJson;
        }
    }

    public /* synthetic */ ComputerContextJson(List list, DesktopImageJson desktopImageJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : desktopImageJson);
    }

    public ComputerContextJson() {
        this(C0881AGi.A00, null);
    }
}
