package com.facebook.aura.network.transport;

import X.AnonymousClass003;
import X.C06H;
import X.C0881AGi;
import X.C7384Etj;
import java.util.List;

/* loaded from: classes3.dex */
public interface HatchRequestBody {

    /* loaded from: classes5.dex */
    public final class Bytes implements HatchRequestBody {
        public final byte[] bytes;
        public final String contentType;

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public Bytes(byte[] bArr, String str) {
            AnonymousClass003.A0u(bArr, str);
            this.bytes = bArr;
            this.contentType = str;
        }
    }

    public final class Empty implements HatchRequestBody {
        public static final Empty INSTANCE = new Empty();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Empty);
        }

        public String toString() {
            return "Empty";
        }

        public int hashCode() {
            return 1478709189;
        }
    }

    public final class Json implements HatchRequestBody {
        public final String value;

        public Json(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* loaded from: classes5.dex */
    public final class Multipart implements HatchRequestBody {
        public final List<HatchMultipartFilePart> fileParts;
        public final List<HatchMultipartPart> parts;

        public final List<HatchMultipartFilePart> getFileParts() {
            return this.fileParts;
        }

        public final List<HatchMultipartPart> getParts() {
            return this.parts;
        }

        public Multipart(List<HatchMultipartPart> list, List<HatchMultipartFilePart> list2) {
            AnonymousClass003.A0u(list, list2);
            this.parts = list;
            this.fileParts = list2;
        }

        public /* synthetic */ Multipart(List list, List list2, int i, C06H c06h) {
            this(list, (i & 2) != 0 ? C0881AGi.A00 : list2);
        }
    }
}
