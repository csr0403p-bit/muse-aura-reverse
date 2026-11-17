package com.facebook.aura.settings.support;

import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public interface HatchSupportTopicLabel {

    public final class Resource extends C06G implements HatchSupportTopicLabel {
        public static final int $stable = 0;
        public final int value;

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Resource) && this.value == ((Resource) obj).value);
        }

        public static /* synthetic */ Resource copy$default(Resource resource, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = resource.value;
            }
            return new Resource(i);
        }

        public final int component1() {
            return this.value;
        }

        public final Resource copy(int i) {
            return new Resource(i);
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value;
        }

        public Resource(int i) {
            this.value = i;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Text extends C06G implements HatchSupportTopicLabel {
        public static final int $stable = 0;
        public final String value;

        public Text(String str) {
            C7384Etj.A0Y(str, 0);
            this.value = str;
        }

        public final Text copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof Text) && C7384Etj.areEqual(this.value, ((Text) obj).value));
        }

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.value;
            }
            C7384Etj.A0Y(str, 0);
            return new Text(str);
        }

        public final String component1() {
            return this.value;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }
}
