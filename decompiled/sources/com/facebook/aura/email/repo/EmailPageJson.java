package com.facebook.aura.email.repo;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iK;
import X.C9iZ;
import X.C9j5;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class EmailPageJson<T> extends C06G {
    public static final C9iZ $cachedDescriptor;
    public static final Companion Companion = new Companion();
    public final List<T> data;
    public final EmailPagingJson paging;

    static {
        C9iK c9iKA1C = C3cG.A1C("com.facebook.aura.email.repo.EmailPageJson", null, 2);
        c9iKA1C.A08("data", true);
        c9iKA1C.A08("paging", true);
        $cachedDescriptor = c9iKA1C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EmailPageJson(List<? extends T> list, EmailPagingJson emailPagingJson) {
        C7384Etj.A0Y(list, 0);
        this.data = list;
        this.paging = emailPagingJson;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_email_repo_repo(EmailPageJson emailPageJson, C9j5 c9j5, C9iZ c9iZ, C9hr c9hr) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(emailPageJson.data)) {
            c9j5.AAQ(emailPageJson.data, C3cG.A19(c9hr), c9iZ, 0);
        }
        if (zAfR || emailPageJson.paging != null) {
            c9j5.AAP(emailPageJson.paging, EmailPagingJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public final EmailPageJson<T> copy(List<? extends T> list, EmailPagingJson emailPagingJson) {
        C7384Etj.A0Y(list, 0);
        return new EmailPageJson<>(list, emailPagingJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EmailPageJson) {
                EmailPageJson emailPageJson = (EmailPageJson) obj;
                if (!C7384Etj.areEqual(this.data, emailPageJson.data) || !C7384Etj.areEqual(this.paging, emailPageJson.paging)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EmailPageJson copy$default(EmailPageJson emailPageJson, List list, EmailPagingJson emailPagingJson, int i, Object obj) {
        if ((i & 1) != 0) {
            list = emailPageJson.data;
        }
        if ((i & 2) != 0) {
            emailPagingJson = emailPageJson.paging;
        }
        C7384Etj.A0Y(list, 0);
        return new EmailPageJson(list, emailPagingJson);
    }

    public final List<T> component1() {
        return this.data;
    }

    public final EmailPagingJson component2() {
        return this.paging;
    }

    public final List<T> getData() {
        return this.data;
    }

    public final EmailPagingJson getPaging() {
        return this.paging;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.data) + AnonymousClass006.A0D(this.paging);
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final <T> C9hr<EmailPageJson<T>> serializer(C9hr<T> c9hr) {
            C7384Etj.A0Y(c9hr, 0);
            return new EmailPageJson$$serializer(c9hr);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EmailPageJson(int i, List list, EmailPagingJson emailPagingJson, C2hx c2hx) {
        this.data = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.paging = null;
        } else {
            this.paging = emailPagingJson;
        }
    }

    public /* synthetic */ EmailPageJson(List list, EmailPagingJson emailPagingJson, int i, C06H c06h) {
        this(C3cI.A10(list, i), (i & 2) != 0 ? null : emailPagingJson);
    }

    public EmailPageJson() {
        this(C0881AGi.A00, null);
    }
}
