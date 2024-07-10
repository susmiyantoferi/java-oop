package project.source.data;

 class SocialMedia {

}

final class Facebook extends SocialMedia{

}

// ERROR cannot inheritor facebook because final class
//class Fakefacebook extends Facebook {
//
//}

class Intagram extends SocialMedia{

  final void login(String username, String password){
    //isi method
  }
}


// ERROR cannot override method because final method
class FakeInstagram extends Intagram{
//  void login(String username, String password){
//  //isi method
// }
}
