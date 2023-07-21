package com.kopo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.kopo.domain.Webtoon;

@Repository
public class WebtoonRepositoryImpl implements WebtoonRepository {
	private List<Webtoon> listOfWebtoons = new ArrayList<Webtoon>();
	
	
	public WebtoonRepositoryImpl() {
		Webtoon webtoon1 = new Webtoon("재혼황후", "img1.jpg");
		webtoon1.setAuthor("히어리");
		webtoon1.setDescription("동대제국의 완벽한 황후였던 나비에. ​황제인 남편이 정부를 황후로 만들려는 것을 알고 이혼을 택한다. 그리고 결심한다. 이곳에서 황후가 될 수 없다면 다른 곳에서 황후가 되겠다고. 인기 웹소설 '재혼 황후'가 웹툰화되다!");
		webtoon1.setRanking("1위");
		webtoon1.setReleaseDay("금요일");
		webtoon1.setWebsite("naver");
		webtoon1.setGenre("로맨스");
		
		Webtoon webtoon2 = new Webtoon("외모지상주의", "img2.jpg");
		webtoon2.setAuthor("박태준");
		webtoon2.setDescription("못생기고 뚱뚱하다고 괴롭힘을 당하며 루저 인생만 살아온 내가 잘생겨졌다는 이유로 인싸가 됐다. 어느 날 자고 일어났더니 갑자기 완벽한 외모와 몸을 지닌 사람이 되어 깨어난다면?");
		webtoon2.setRanking("2위");
		webtoon2.setReleaseDay("금요일");
		webtoon2.setWebsite("naver");
		webtoon2.setGenre("드라마");
		
		Webtoon webtoon3 = new Webtoon("광마회귀", "img3.jpg");
		webtoon3.setAuthor("JP");
		webtoon3.setDescription("무공에 미친 광마 이자하. 그는 마교 교주의 천옥을 훔쳐 쫓기던 중 벼랑에서 떨어지게 된다. 모든 게 끝났다고 생각한 순간 눈을 떠보니, 사람들에게 무시당하던 점소이 시절로 돌아와 있는데... 게다가 억울한 누명으로 두들겨 맞고 객잔은 박살이 나 있는 상황. ​점소이 시절로 회귀한 광마! 사내는 다시 미치게 될 것인가? 아니면 ...");
		webtoon3.setRanking("3위");
		webtoon3.setReleaseDay("금요일");
		webtoon3.setWebsite("naver");
		webtoon3.setGenre("무협");
		
		listOfWebtoons.add(webtoon1);
		listOfWebtoons.add(webtoon2);
		listOfWebtoons.add(webtoon3);
	}	
	
	@Override
	public List<Webtoon> getAllWebtoonList() {
		// TODO Auto-generated method stub
		return listOfWebtoons;
	}

}
