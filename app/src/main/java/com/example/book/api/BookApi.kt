package com.example.book.api

import com.example.book.model.BookDetail
import retrofit2.Call
import retrofit2.http.*

interface BookApi {

    companion object {
        const val Base_URL = "https://stgapi.gajino.com/api/v2/BookLibrary/"
    }

    @Headers(
        "IMEI: ec176f37b91e212a",
        "Content-Type: application/json",
        "Authorization: Bearer tlw2tzlYRI5AgND8fpWSx199+YT22h3caz33+wSTzMcHvfFc9OXciWTpMSdrXUcLANyzCCESqPIKQu0eeiLypC+pXSRLFYG1zHC/GRDYS6looN7f0dIcmZCxTuvw37+tiLYX/KmCkFYet+u5znycatNoejsC7cJrQzsQmsNjPhLM+5TrIaG5kVnSm2ba8y/IbWpSwCF6+yv2s58PYH0h2F5RNR1qtZ3fakneouU0cedsCaPLL1/V9JhxZpOzER8719F5CTo/jMmNriyoUH3UOrNlk8+5LFNZtSWcCSji6vHcwQhbhYQfdsAB9P8KG7QnZik7WcasDRpTEfseDxNYabyShzVt6fJxgw5hbM2IzhwKVwcbcnqppB/4g4jqzwkM01jvIVbf41qq5QRymxEjsQr7Mo9LWD3nsJFx6L2enVYdh6TiUExQ3gDNzxjJSu1MElASUVenor4nwWxGNaAkrgJLHGN9rff4sLOEojydIB1y3QDHjqPRpr2whqz/4VSqcoYxbk6Wx8Wa9/uDZft4fgc/uAw311f5J0fgNkpjokCTaceT4o3KTyV48XTf8Vs2tJugv46dWNPYXcmTWvZQeD4Osjs00aRTVCUkNS2gg2IkzCwoav8ycJXVkrAzbtMbaEObnHPDVyf6M70ZngoCuaVjm1Drbi1+YIyO7zJiw87CdNHIVRAyUftA9iy5qKf4SkWy3WQH3Q+TQwvkDib0JkBX6heKJ74/9BcPex+FGe62dVY0iQmKpQIZ1h9QwDzdXdXW1ZNIR0IOWybJ/ta/aDAia7IVxATulzvMb6wridU="
    )

    @GET("GetBookInfo/{bookLibraryId}")
    fun getDetails(@Path("bookLibraryId") bookLibraryId: Int): Call<BookDetail>
}