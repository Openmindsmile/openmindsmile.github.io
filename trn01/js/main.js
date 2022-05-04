// window.addEventListener('DOMcontentloaded', function) {
// document.querySelector('.header').style.display = 'none';
// })
// 객체들은 끝에 콤마를 붙인다 - 세미콜론이 아님 
$(function () {
    $('.main_slider').slick({
        arrows: false,
        autoplay: true,
        autoplaySpeed: 1000,
        vertical: true,
        dots: true,
    })


    $('.mopen').on('click', function () {
        $('.gnb').toggleClass('on')
    })

})

// 객체들은 끝에 콤마를 붙인다 - 세미콜론이 아님
// 슬라이드 텍스트에 그라데이션 넣기 과제
