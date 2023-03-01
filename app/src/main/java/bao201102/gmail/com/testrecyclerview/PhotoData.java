package bao201102.gmail.com.testrecyclerview;

import java.util.ArrayList;

public class PhotoData {
    public static ArrayList<Photo> generatePhotoData(){
        ArrayList<Photo> photos = new ArrayList<>();
        photos.add(new Photo(0,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(1,"https://upload.wikimedia.org/wikipedia/vi/thumb/d/d3/Starbucks_Corporation_Logo_2011.svg/1200px-Starbucks_Corporation_Logo_2011.svg.png",
                "Starbucks",
                "Cà phê espresso đậm vị và bốc hơi sữa - ngon tuyệt hảo khi thưởng thức riêng hay khi thêm đường."));
        photos.add(new Photo(2,"https://upload.wikimedia.org/wikipedia/en/thumb/b/bf/KFC_logo.svg/800px-KFC_logo.svg.png",
                "KFC",
                "KFC là tên viết tắt của Kentucky Fried Chicken, một thương hiệu và mảng hoạt động của Yum! International Restaurant Group (Hoa Kỳ). KFC bán gà rán, một loại thức ăn nhanh ngày càng trở nên phổ biến ở các quốc gia đông dân trên toàn thế giới. Ngày nay, chuỗi KFC đã có mặt tại 109 quốc gia và vùng lãnh thổ trên thế giới, với hơn 20.000 nhà hàng phục vụ 12 triệu khách mỗi ngày."));
        photos.add(new Photo(3,"https://upload.wikimedia.org/wikipedia/vi/thumb/c/c9/Highlands_Coffee_logo.svg/1200px-Highlands_Coffee_logo.svg.png",
                "Highlands Coffee",
                "Highlands Coffee® được thành lập vào năm 1999, bắt nguồn từ tình yêu dành cho đất Việt cùng với cà phê và cộng đồng nơi đây. Ngay từ những ngày đầu tiên, mục tiêu của chúng mình là có thể phục vụ và góp phần phát triển cộng đồng bằng cách siết chặt thêm sự kết nối và sự gắn bó giữa người với người."));
        photos.add(new Photo(4,"https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Apple_park_cupertino_2019.jpg/1920px-Apple_park_cupertino_2019.jpg",
                "Apple",
                "Apple Inc. là một Tập đoàn công nghệ đa quốc gia của Mỹ có trụ sở chính tại Cupertino, California, chuyên Thiết kế, phát triển và bán thiết bị điện tử tiêu dùng, phần mềm máy tính và các Dịch vụ trực tuyến. Nó được coi là một trong năm công ty lớn của ngành công nghệ thông tin Hoa Kỳ , cùng với Amazon, Google, Microsoft và Meta."));
        photos.add(new Photo(5,"https://upload.wikimedia.org/wikipedia/vi/thumb/d/d3/Starbucks_Corporation_Logo_2011.svg/1200px-Starbucks_Corporation_Logo_2011.svg.png",
                "Starbucks",
                "Cà phê espresso đậm vị và bốc hơi sữa - ngon tuyệt hảo khi thưởng thức riêng hay khi thêm đường."));
        photos.add(new Photo(6,"https://upload.wikimedia.org/wikipedia/en/thumb/b/bf/KFC_logo.svg/800px-KFC_logo.svg.png",
                "KFC",
                "KFC là tên viết tắt của Kentucky Fried Chicken, một thương hiệu và mảng hoạt động của Yum! International Restaurant Group (Hoa Kỳ). KFC bán gà rán, một loại thức ăn nhanh ngày càng trở nên phổ biến ở các quốc gia đông dân trên toàn thế giới. Ngày nay, chuỗi KFC đã có mặt tại 109 quốc gia và vùng lãnh thổ trên thế giới, với hơn 20.000 nhà hàng phục vụ 12 triệu khách mỗi ngày."));
        photos.add(new Photo(7,"https://upload.wikimedia.org/wikipedia/vi/thumb/c/c9/Highlands_Coffee_logo.svg/1200px-Highlands_Coffee_logo.svg.png",
                "Highlands Coffee",
                "Highlands Coffee® được thành lập vào năm 1999, bắt nguồn từ tình yêu dành cho đất Việt cùng với cà phê và cộng đồng nơi đây. Ngay từ những ngày đầu tiên, mục tiêu của chúng mình là có thể phục vụ và góp phần phát triển cộng đồng bằng cách siết chặt thêm sự kết nối và sự gắn bó giữa người với người."));

        return photos;
    }

    public static Photo getPhotoFromId(int id){
        ArrayList<Photo> phs = generatePhotoData();
        for (int i = 0; i < phs.size(); i++) {
            if (phs.get(i).getId() == id)
                return phs.get(i);
        }
        return null;
    }
}
