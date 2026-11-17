package com.facebook.aura.opengraph;

import X.AnonymousClass001;
import X.C06H;
import X.C7384Etj;
import X.C7BY;
import X.DCl;
import X.FGI;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class HatchWebPageReader {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_READ_BYTES = 2097152;

    @Deprecated
    public static final int MAX_RETAINED_BYTES = 262144;

    @Deprecated
    public static final int MAX_TAG_BYTES = 16384;
    public int bytesRead;
    public final byte[] chunk;
    public boolean exhausted;
    public final ByteArrayOutputStream html;
    public final InputStream input;
    public int length;
    public int position;

    public final class Tag {
        public final byte[] bytes;
        public final boolean closing;
        public final String name;

        public Tag(String str, boolean z, byte[] bArr) {
            C7384Etj.A0Y(str, 0);
            this.name = str;
            this.closing = z;
            this.bytes = bArr;
        }

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final boolean getClosing() {
            return this.closing;
        }

        public final String getName() {
            return this.name;
        }
    }

    public HatchWebPageReader(InputStream inputStream) {
        C7384Etj.A0Y(inputStream, 0);
        this.input = inputStream;
        this.chunk = new byte[8192];
        this.html = new ByteArrayOutputStream(8192);
    }

    private final void skipTagEnd(int i) throws IOException {
        int i2 = 0;
        while (i >= 0) {
            if (i2 != 0) {
                if (i == i2) {
                    i2 = 0;
                }
            } else if (i == 34 || i == 39) {
                i2 = i;
            } else if (i == 62) {
                return;
            }
            i = readByte();
        }
    }

    public final byte[] readBody() throws IOException {
        readHtml(false);
        return C7384Etj.A0d(this.html);
    }

    public final byte[] readHead() throws IOException {
        readHtml(true);
        return C7384Etj.A0d(this.html);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final boolean isTagBoundary(char c) {
        return c == '>' || c == '/' || C7BY.A0k(" \t\r\n\f", c);
    }

    private final int readByte() throws IOException {
        if (!this.exhausted) {
            int i = this.position;
            if (i == this.length) {
                int i2 = 2097152 - this.bytesRead;
                if (i2 != 0) {
                    InputStream inputStream = this.input;
                    byte[] bArr = this.chunk;
                    int i3 = inputStream.read(bArr, 0, Math.min(bArr.length, i2));
                    this.length = i3;
                    this.position = 0;
                    i = 0;
                    if (i3 <= 0) {
                        this.exhausted = true;
                    } else {
                        this.bytesRead += i3;
                    }
                }
            }
            byte[] bArr2 = this.chunk;
            this.position = i + 1;
            return bArr2[i] & 255;
        }
        return -1;
    }

    private final void readHtml(boolean z) throws IOException {
        int i;
        while (this.html.size() < 262144 && (i = readByte()) >= 0) {
            if (i != 60) {
                this.html.write(i);
            } else {
                Tag tag = readTag();
                if (tag == null) {
                    return;
                }
                if (!tag.closing) {
                    String str = tag.name;
                    if ("script".equals(str) || "style".equals(str)) {
                        skipRawText(str);
                    }
                }
                byte[] bArr = tag.bytes;
                if (bArr == null) {
                    continue;
                } else {
                    if (bArr.length > 262144 - this.html.size()) {
                        this.exhausted = true;
                        return;
                    }
                    this.html.write(bArr);
                    if (z && tag.closing && "head".equals(tag.name)) {
                        return;
                    }
                }
            }
        }
    }

    private final Tag readTag() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
        byteArrayOutputStream.write(60);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            int i4 = readByte();
            if (i4 < 0) {
                return null;
            }
            if (byteArrayOutputStream.size() < 16384) {
                byteArrayOutputStream.write(i4);
            } else {
                z2 = true;
            }
            if (byteArrayOutputStream.size() == 4 && "<!--".equals(byteArrayOutputStream.toString(DCl.A00.name()))) {
                z = true;
            }
            if (z) {
                if (i2 == 45 && i3 == 45 && i4 == 62) {
                    return new Tag("", false, null);
                }
            } else if (i != 0) {
                if (i4 == i) {
                    i = 0;
                }
            } else if (i4 == 34 || i4 == 39) {
                i = i4;
            } else if (i4 == 62) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                C7384Etj.A0X(byteArray);
                String str = new String(byteArray, DCl.A00);
                boolean zStartsWith = str.startsWith("</");
                String strSubstring = str.substring(zStartsWith ? 2 : 1);
                int length = strSubstring.length();
                int i5 = 0;
                while (true) {
                    if (i5 >= length) {
                        break;
                    }
                    if (isTagBoundary(strSubstring.charAt(i5))) {
                        strSubstring = strSubstring.substring(0, i5);
                        break;
                    }
                    i5++;
                }
                return new Tag(AnonymousClass001.A0u(strSubstring), zStartsWith, z2 ? null : byteArray);
            }
            i2 = i3;
            i3 = i4;
        }
    }

    private final void skipRawText(String str) throws IOException {
        String strA0M = FGI.A0M("</", str);
        while (true) {
            int i = 0;
            while (true) {
                int i2 = readByte();
                if (i2 < 0) {
                    return;
                }
                char lowerCase = Character.toLowerCase((char) i2);
                if (i == strA0M.length()) {
                    if (isTagBoundary(lowerCase)) {
                        skipTagEnd(i2);
                        return;
                    }
                    i = 0;
                }
                if (lowerCase == strA0M.charAt(i)) {
                    i++;
                } else {
                    i = 1;
                    if (lowerCase != '<') {
                        break;
                    }
                }
            }
        }
    }

    public final int getBytesRead() {
        return this.bytesRead;
    }
}
